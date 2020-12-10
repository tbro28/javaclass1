package cp510;

import java.awt.Rectangle;

public class RectangleExA
{
    private Rectangle   rect;
    
    public static void main( String[] args )
    {
       RectangleExA test    =
           new RectangleExA( 5.5, 4.4, 100.6, 100.4 );
       System.out.println( test.rect );
    }

    public
    RectangleExA( double xco, double yco, double width, double height )
    {
        int iXco    = (int)(xco + .5);
        int iYco    = (int)(yco + .5);
        int iWidth  = (int)(width + .5);
        int iHeight = (int)(height + .5);
        rect = new Rectangle( iXco, iYco, iWidth, iHeight );
    }
    
    public void addWidth( double toAdd )
    {
        double  newWidth    = rect.getWidth() + toAdd;
        int     iNewWidth   = (int)(newWidth + .5);
        rect.width = iNewWidth;
    }
}
