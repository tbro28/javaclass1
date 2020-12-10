package cp510;

import java.awt.Rectangle;

public class RectangleExB
{
    private Rectangle   rect;
    private double      xco;
    private double      yco;
    private double      width;
    private double      height;
    
    public static void main( String[] args )
    {
       RectangleExB test    =
           new RectangleExB( 5.5, 4.4, 100.6, 100.4 );
       System.out.println( test.rect );
    }

    public
    RectangleExB( double xco, double yco, double width, double height )
    {
        this.xco = xco;
        this.yco = yco;
        this.width = width;
        this.height = height;

        int iXco    = (int)(xco + .5);
        int iYco    = (int)(yco + .5);
        int iWidth  = (int)(width + .5);
        int iHeight = (int)(height + .5);
        rect = new Rectangle( iXco, iYco, iWidth, iHeight );
    }
    
    public void addWidth( double toAdd )
    {
        width = width + toAdd;
        int     iNewWidth   = (int)(width + .5);
        rect.width = iNewWidth;
    }
}
