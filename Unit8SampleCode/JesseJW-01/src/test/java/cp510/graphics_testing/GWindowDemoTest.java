package cp510.graphics_testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.junit.jupiter.api.Test;

class GWindowDemoTest
{
    @Test
    void test()
    {
        GWindowDemo     demo        = new GWindowDemo( 300, 300 );
        BufferedImage   image       = demo.getBitmap();
        int             type        = image.getType();
        int             width       = image.getWidth();
        int             height      = image.getHeight();
        BufferedImage   expImage    = new BufferedImage( width, height, type );
        Graphics2D      gtx         = (Graphics2D)expImage.createGraphics();
        Color           bgColor     = new Color( 0xffbb1ad5 );
        Color           color       = new Color( 0xff19b89c );
        int             xco         = 0;
        int             yco         = 0;
        int             incr        = 15;
        
        demo.setBgColor( bgColor );
        gtx.setColor( bgColor );
        gtx.fillRect( 0,  0,  width, height);
        demo.refresh();
        assertTrue( Utils.testEquals( expImage, demo.getBitmap() ) );
        
        demo.setColor( color );
        gtx.setColor( color );
        
        width /= 4;
        height /= 8;
        int limit = 3 * width;
        for ( ; xco < limit ; xco += incr, yco += incr )
        {
            Rectangle2D rect    = 
                new Rectangle2D.Double( xco, yco, width, height );
            gtx.fill( rect );
            demo.addRect( rect );
            demo.refresh();
            Utils.pause( 250 );
//            next();
            assertTrue( Utils.testEquals( expImage, demo.getBitmap() ) );
        }
    }
    
//    private void next()
//    {
//        JOptionPane.showMessageDialog( null, "Whenever you're ready" );
//    }
}
