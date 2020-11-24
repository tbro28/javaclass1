package cp510.assignments;

import java.awt.*;

public class RGBFormatDemo
{
    public static void main(String[] args)
    {
        Color   color   = Color.BLUE;
        int     argb    = color.getRGB();
        int     rgb     = argb & 0x00FFFFFF;
        System.out.println( String.format( "#%06X", rgb ) );

        color   = Color.GREEN;
        argb    = color.getRGB();
        rgb     = argb & 0x00FFFFFF;
        System.out.println( String.format( "#%06X", rgb ) );

        color   = Color.MAGENTA;
        argb    = color.getRGB();
        rgb     = argb & 0x00FFFFFF;
        System.out.println( String.format( "#%06X", rgb ) );

        color   = Color.LIGHT_GRAY;
        argb    = color.getRGB();
        rgb     = argb & 0x00FFFFFF;
        System.out.println( String.format( "#%06X", rgb ) );

        color   = Color.RED;
        argb    = color.getRGB();
        rgb     = argb & 0x00FFFFFF;
        System.out.println( String.format( "#%06X", rgb ) );

    }

}