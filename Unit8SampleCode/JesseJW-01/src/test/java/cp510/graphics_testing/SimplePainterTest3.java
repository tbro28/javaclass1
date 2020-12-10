package cp510.graphics_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.function.Consumer;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimplePainterTest3
{
    private Consumer<String> validate   = null;
    
    private final String    prefix      = 
            "src\\test\\resources\\" + getClass().getName();
    private final String    imageFormat = "GIF";
    private final Random    randy       = new Random( 1 );
    private int             seqNum      = 0;
    private SimplePainter   painter;
    private Component       canvas;
    
    @BeforeAll
    static void beforeAll()
    {
    }
    
//    @BeforeEach
    void setupAlt()
    {
        // Setup validator using traditional anonymous class
        String  mode    = System.getenv( "TEST_MODE" );
        if ( "AUTO".equals( mode ) )
            validate = new Consumer<String>() {
                public void accept( String fileName )
                {
                    autoTest( fileName );
                }
            };
        else
            validate = new Consumer<String>() {
            public void accept( String fileName )
            {
                ask( fileName );
            }
        };
    }
    
    @BeforeEach
    void setup()
    {
        String  mode    = System.getenv( "TEST_MODE" );
        if ( "AUTO".equals( mode ) )
            validate = t -> autoTest( t );
        else
            validate = t -> ask( t );

        painter = new SimplePainter();
        painter.start();
        canvas = Utils.findCompByName( SimplePainter.CANVAS_NAME );
        assertNotNull( canvas );
    }
    
    @Test
    void test()
    {
        painter.setBgColor( nextColor() );
        painter.refresh();
        validate.accept( nextFileName() );
        
        int     xco         = 0;
        int     yco         = 0;
        int     xIncr       = 15;
        int     yIncr       = 15;
        int     width       = 100;
        int     height      = 50;
       
        Rectangle2D rect    = 
            new Rectangle2D.Double( xco, yco, width, height );
        painter.setShapeColor( nextColor() );
        painter.setEdgeColor( null );
        painter.addRectangle( rect );
        painter.refresh();
        validate.accept( nextFileName() );
        
        xco += xIncr;
        yco += yIncr;
        rect = new Rectangle2D.Double( xco, yco, width, height );
        painter.setShapeColor( null );
        painter.setEdgeColor( nextColor() );
        painter.addRectangle( rect );
        painter.refresh();
        validate.accept( nextFileName() );
        
        xco +=xIncr;
        yco += yIncr;
        for ( ; xco < 100 ; xco += xIncr, yco += yIncr )
        {
            rect = new Rectangle2D.Double( xco, yco, width, height );
            painter.setShapeColor( nextColor() );
            painter.setEdgeColor( nextColor() );
            painter.addRectangle( rect );
            painter.refresh();
            validate.accept( nextFileName() );
        }
    }
    
    private Color nextColor()
    {
        int     colorVal    = randy.nextInt( 0x1000000 );
        Color   color       = new Color( colorVal );
        return color;
    }

    private String nextFileName()
    {
        String  name    = 
            String.format( "%s%03d.%s", prefix, seqNum, imageFormat );
        seqNum += 10;
        return name;
    }

    private void ask( String fileName )
    {
        final String[]  options     = new String[] { "Fail", "Pass", "Save" };
        final int       failOption  = 0; 
        final int       passOption  = 1; 
        final int       saveOption  = 2; 
        final String    prompt      = "Fail, Pass or Pass/Save?";
        
        int option  = JOptionPane.showOptionDialog( 
            null, 
            prompt, 
            "Tester", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            0
        );
        
        assertNotEquals( option, failOption );
        if ( option == saveOption )
        {
            if ( fileName != null )
                save( fileName );
        }
        else
            assertEquals( passOption, option );
    }
    
    private void save( String fileName )
    {
        BufferedImage   image   = getBitmap();
        File            file    = new File( fileName );
        
        try
        {
            ImageIO.write( image, imageFormat, file );
        }
        catch ( IOException exc )
        {
            throw new IOFailure( "image write failed", exc );
        }
    }
    
    private void autoTest( String fileName )
    {
        BufferedImage   expImage    = read( fileName );
        BufferedImage   actImage    = getBitmap();
        assertTrue( 
            Utils.testEquals( expImage, actImage ), " in " + fileName );
    }
    
    private BufferedImage read( String fileName )
    {
        BufferedImage   image   = null;
        File            file    = new File( fileName );
        
        try
        {
            image = ImageIO.read( file );
        }
        catch ( IOException exc )
        {
            throw new IOFailure( "image read failed", exc );
        }
        
        return image;
    }
    
    private BufferedImage getBitmap()
    {
        int             width   = canvas.getWidth();
        int             height  = canvas.getHeight();
        int             type    = BufferedImage.TYPE_INT_RGB;
        BufferedImage   image   = new BufferedImage( width, height, type );
        Graphics        gtx     = image.getGraphics();
        canvas.paint( gtx );
        
        return image;
    }
    
    @SuppressWarnings("serial")
    private static class IOFailure extends RuntimeException
    {
//        public IOFailure( String msg )
//        {
//            super( msg );
//        }
        
        public IOFailure( String msg, Throwable cause )
        {
            super( msg, cause );
        }

    }
}
