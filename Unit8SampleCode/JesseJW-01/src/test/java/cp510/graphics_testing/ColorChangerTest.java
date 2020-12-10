package cp510.graphics_testing;

import static cp510.graphics_testing.ColorChanger.CANVAS_NAME;
import static cp510.graphics_testing.ColorChanger.EXIT_BUTTON_NAME;
import static cp510.graphics_testing.ColorChanger.FRAME_NAME;
import static cp510.graphics_testing.ColorChanger.SANDBOX_BUTTON_NAME;
import static cp510.graphics_testing.ColorChanger.SHAPE_BUTTON_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JButton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ColorChangerTest
{
    private static final long   PAUSE_TIME  = 250;
    
    @BeforeAll
    static void beforeAll()
    {
//        System.setSecurityManager( new SManager() );
    }
    
    @Test
    void test()
    {
        new ColorChanger();
        Utils.pause( 250 );
        
        JButton sandboxButton   = (JButton)
            Utils.findCompByName( SANDBOX_BUTTON_NAME );
        JButton shapeButton     = (JButton)
            Utils.findCompByName( SHAPE_BUTTON_NAME );
        JButton exitButton      = (JButton)
            Utils.findCompByName( EXIT_BUTTON_NAME );
        Component   canvas  = Utils.findCompByName( CANVAS_NAME );
        Component   frame   = Utils.findCompByName( FRAME_NAME );
        
        assertNotNull( sandboxButton );
        assertNotNull( shapeButton );
        assertNotNull( exitButton );
        assertNotNull( canvas );
        assertNotNull( frame );
        
        int             width   = canvas.getWidth();
        int             height  = canvas.getHeight();
        int             type    = BufferedImage.TYPE_INT_RGB;
        BufferedImage   image   = new BufferedImage( width, height, type );
        Graphics        gtx     = image.getGraphics();
        canvas.paint( gtx );
        
        int     centerX         = width / 2;
        int     centerY         = height / 2;
        int     oldBgColor      = image.getRGB( 0,  0 );
        int     oldShapeColor   = image.getRGB( centerX, centerY );
        
        sandboxButton.doClick();
        Utils.pause( PAUSE_TIME );
        canvas.paint( gtx );
        int     actBgColor      = image.getRGB( 0,  0 );
        int     actShapeColor   = image.getRGB( centerX, centerY );
        assertNotEquals( oldBgColor, actBgColor );
        assertEquals( oldShapeColor, actShapeColor );
        
        oldBgColor = actBgColor;
        oldShapeColor = actShapeColor;
        
        shapeButton.doClick();
        Utils.pause( PAUSE_TIME );
        canvas.paint( gtx );
        actBgColor = image.getRGB( 0,  0 );
        actShapeColor = image.getRGB( centerX, centerY );
        assertEquals( oldBgColor, actBgColor );
        assertNotEquals( oldShapeColor, actShapeColor );
        
        exitButton.doClick();
        Utils.pause( 250 );
        assertFalse( frame.isVisible() );
    }
}