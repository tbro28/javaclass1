package cp510.assignments.geo_shape;

import java.awt.Color;

/**
 * Encapsulates functionality common to all shapes in the geo_shape package.
 *
 * @author Tim
 */
public class GeoShape {

    private GeoPoint origin;
    private Color color;

    /**
     * Constructor for GeoShape objects.
     */
    public GeoShape(){

        this.origin = new GeoPoint();
    }

    /**
     * Constructor for GeoShape objects with an origin.
     *
     * @param origin
     */
    GeoShape(GeoPoint origin) {
        this.origin = origin;
    }

    /**
     *  Constructor for GeoShape objects with an origin and color.
     *
     * @param origin
     * @param color
     */
    GeoShape(GeoPoint origin, Color color) {
        this.origin = origin;
        this.color = color;
    }

    /**
     *  Returns the origin of this shape.
     *
     * @return origin
     */
    public GeoPoint getOrigin() {
        return origin;
    }

    /**
     * Sets the origin of this shape to a given value.
     *
     * @param origin
     */
    public void setOrigin(GeoPoint origin) {
        //this.origin = origin;
        this.origin.setXco(origin.getXco());
        this.origin.setYco(origin.getYco());
    }

    /**
     * Returns the fill color of this shape.
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the fill color of this shape to a given value.
     *
     * @param color
     */
    public void setColor(Color color) {

        this.color = color;

    }

    /**
     * Returns a string describing the origin
     * and color properties of this GeoShape.
     *
     * @return
     */
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
