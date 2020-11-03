package cp510.assignments.geo_shape;

import java.awt.Color;

public class GeoShape {

    private GeoPoint origin;
    private Color color;
//Don't know what color is either :)

    //should default == 0?????????????????
    public GeoShape(){

        this.origin = new GeoPoint();
        //origin.setXco(1.0);
        //origin.setYco(1.0);

    }

    GeoShape(GeoPoint origin) {
        this.origin = origin;
    }

    GeoShape(GeoPoint origin, Color color) {
        this.origin = origin;
        this.color = color;
    }

    public GeoPoint getOrigin() {
        return origin;
    }

    public void setOrigin(GeoPoint origin) {
        //this.origin = origin;
        this.origin.setXco(origin.getXco());
        this.origin.setYco(origin.getYco());
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {

        this.color = color;

        /*
        if(color != null) {

        }
        */

    }

    @Override
    public String toString() {


        StringBuilder sb = new StringBuilder();

        sb.append("origin=" + origin);
        if(color != null) {
            int argb    = color.getRGB();
            int rgb     = argb & 0x00FFFFFF;
            sb.append(",color=" + String.format( "#%06X", rgb ));
        }
        else
            sb.append(",color=" + color);

        return sb.toString();
    }
}
