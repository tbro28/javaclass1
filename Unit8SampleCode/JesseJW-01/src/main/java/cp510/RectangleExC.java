package cp510;

import java.awt.geom.Rectangle2D;

public class RectangleExC
{
    private Rectangle2D rect;
    
    public static void main( String[] args )
    {
       RectangleExC test    =
           new RectangleExC( 5.5, 4.4, 100.6, 100.4 );
       System.out.println( test.rect );
    }

    public
    RectangleExC( double xco, double yco, double width, double height )
    {
        rect = new Rectangle2D.Double( xco, yco, width, height );
    }
    
    public void addWidth( double toAdd )
    {
        double  newWidth    = rect.getWidth() + toAdd;
        rect.setRect( rect.getX(), rect.getHeight(),
                      newWidth, rect.getHeight() );
    }
}
