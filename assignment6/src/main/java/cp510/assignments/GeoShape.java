package cp510.assignments;

import java.awt.*;
import java.util.Formatter;

/**
 * Encapsulates functionality common to all shapes in the geo_shape package.
 *
 * @author Tim
 */
public abstract class GeoShape {

    /**
     * Constants.
     */
    public static final Color DEFAULT_COLOR = BLUE;
    public static final Color DEFAULT_EDGE_COLOR = BLACK;
    public static final double DEFAULT_EDGE_WIDTH = 1;
    public static final GeoPoint DEFAULT_ORIGIN = new GeoPoint( 0, 0 );

    /**
     * Properties.
     */
    private GeoPoint origin;
    private Color color;
    private Color edgeColor;
    private double edgeWidth;



//    /**
//     * Constructor for GeoShape objects.
//     */
//    public GeoShape(){
//
//        this.origin = new GeoPoint();
//    }
//
//    /**
//     * Constructor for GeoShape objects with an origin.
//     *
//     * @param origin
//     */
//    GeoShape(GeoPoint origin) {
//        this.origin = origin;
//    }





    /**
     *  Constructor for GeoShape objects with an origin and color.
     *  Origin cannot be NULL.
     *
     * @param origin
     * @param color
     */
    GeoShape(GeoPoint origin, Color color) throws NullPointerException {

        if(origin.equals(null))
            throw new NullPointerException();

        this.origin = origin;
        this.color = color;
    }


    /**
     *
     * Abstract method to be implemented.
     *
     * @param gtx
     */
    public abstract void draw(Graphics2D gtx);

    /**
     *
     * Get edge color.
     *
     * @return
     */
    public Color getEdgeColor() {
        return edgeColor;
    }

    /**
     *
     * Set edge color.
     *
     * @param edgeColor
     */
    public void setEdgeColor(Color edgeColor) {
        this.edgeColor = edgeColor;
    }

    /**
     *
     * Get edge width.
     *
     * @return
     */
    public double getEdgeWidth() {
        return edgeWidth;
    }

    /**
     *
     * Set edge width.
     *
     * @param edgeWidth
     */
    public void setEdgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
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
    public void setOrigin(GeoPoint origin) throws NullPointerException {
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

        if(edgeColor != null) {
            int argb    = edgeColor.getRGB();
            int rgb     = argb & 0x00FFFFFF;
            sb.append(",edgeColor=" + String.format( "#%06X", rgb ));
        }
        else
            sb.append(",edgeColor=" + edgeColor);

        Formatter formatted = new Formatter(sb);
        formatted.format("%.4f", edgeWidth);     // 4 decimal places

        return sb.toString();
    }

}
