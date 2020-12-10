package cp510.graphics_testing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SimplePainter implements Runnable
{
    public static final String  CANVAS_NAME = "Painter";
    
    private Color               shapeColor  = Color.RED;
    private Color               edgeColor   = Color.BLACK;
    private List<Rectangle2D>   rects       = new ArrayList<>();
    private Painter             painter     = new Painter();
    
    public static void main( String[] args )
    {
        new SimplePainter().start();
    }
    
    public void start()
    {
        try
        {
            SwingUtilities.invokeAndWait( this );
        }
        catch ( InvocationTargetException exc )
        {
            exc.printStackTrace();
            System.exit( 1 );
        }
        catch ( InterruptedException exc )
        {
            // don't care
        }
    }
    
    public void setBgColor( Color color )
    {
        painter.setBackground( color );
    }
    
    public void setShapeColor( Color color )
    {
        shapeColor = color;
    }
    
    public void setEdgeColor( Color color )
    {
        edgeColor = color;
    }
    
    public void addRectangle( Rectangle2D rect )
    {
        rects.add( rect );
    }
    
    @Override
    public void run()
    {
        JFrame  frame   = new JFrame( "Simple Painter" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setContentPane( painter );
        System.out.println( painter.getName() );
        
        frame.pack();
        frame.setVisible( true );
    }
    
    public void refresh()
    {
        painter.repaint();
    }
    
    @SuppressWarnings("serial")
    public class Painter extends JPanel
    {
        public Painter()
        {
            setName( CANVAS_NAME );
            setBackground( new Color( 0xAAAAAA ) );
            setPreferredSize( new Dimension( 300, 200 ) );
        }
        
        @Override
        public void paintComponent( Graphics graphics )
        {
            super.paintComponent( graphics );
            Graphics2D  gtx         = (Graphics2D)graphics.create();
            for ( Rectangle2D rect : rects )
            {
                if ( shapeColor != null )
                {
                    gtx.setColor( shapeColor );
                    gtx.fill( rect );
                }
                if ( edgeColor != null )
                {
                    gtx.setColor( edgeColor );
                    gtx.draw( rect );
                }
            }
        }
    }
}
