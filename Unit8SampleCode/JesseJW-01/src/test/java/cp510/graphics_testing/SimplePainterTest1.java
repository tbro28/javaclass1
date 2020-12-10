package cp510.graphics_testing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import org.junit.jupiter.api.Test;

class SimplePainterTest1
{   
    @Test
    void test()
    {
        Color           bgColor     = Color.ORANGE;
        Color           shapeColor  = Color.CYAN;
        Color           edgeColor   = Color.BLACK;
        SimplePainter   painter     = new SimplePainter();
        painter.setBgColor( bgColor );
        painter.setShapeColor( shapeColor );
        painter.setEdgeColor( edgeColor );
        painter.start();
        
        String      name    = SimplePainter.CANVAS_NAME;
        JPanel      comp    = (JPanel)Utils.findCompByName( name );
        assertNotNull( comp );
        
        int             width       = comp.getWidth();
        int             height      = comp.getHeight();
        int             type        = BufferedImage.TYPE_INT_RGB;
        BufferedImage   expImage    = new BufferedImage( width, height, type );
        BufferedImage   actImage    = new BufferedImage( width, height, type );
        Graphics2D      expGtx      = (Graphics2D)expImage.getGraphics();
        Graphics2D      actGtx      = (Graphics2D)actImage.getGraphics();
        
        expGtx.setColor( bgColor );
        expGtx.fillRect( 0,  0,  width, height );
        comp.paint( actGtx );
        Utils.testEquals( expImage, actImage );
        for ( int xco = 0, yco = 0 ; xco < 100 ; xco += 15, yco += 15 )
        {
            Rectangle2D rect    = new Rectangle2D.Double( xco, yco, 100, 50 );
            expGtx.setColor( shapeColor );
            expGtx.fill( rect );
            expGtx.setColor( edgeColor );
            expGtx.draw( rect );
            painter.addRectangle( rect );
            comp.paint( actGtx );
            Utils.testEquals( expImage, actImage );
        }
    }
}
