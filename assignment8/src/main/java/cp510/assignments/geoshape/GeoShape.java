package cp510.assignments.geoshape;

import java.awt.*;
import java.util.Formatter;

/**
 * Encapsulates functionality common to all shapes in the geoshape package.
 *
 * @author Tim
 */
public abstract class GeoShape {

    /**
     * Set the default color to black.
     */
    public static final Color DEFAULT_COLOR = Color.BLUE;

    /**
     * Set the default edge color to black.
     */
    public static final Color DEFAULT_EDGE_COLOR = Color.BLACK;

    /**
     * Set the default edge width to 1.
     */
    public static final double DEFAULT_EDGE_WIDTH = 1;

    /**
     * Set the default origin to 0,0.
     */
    public static final cp510.assignments.geoshape.GeoPoint DEFAULT_ORIGIN = new cp510.assignments.geoshape.GeoPoint( 0, 0 );

    /**
     * Properties.
     */
    private cp510.assignments.geoshape.GeoPoint origin;
    private Color color;
    private Color edgeColor;
    private double edgeWidth;

    /**
     *  Constructor for GeoShape objects with an origin and color.
     *  Origin cannot be NULL.
     *
     * @param origin
     * @param color
     */
    GeoShape(cp510.assignments.geoshape.GeoPoint origin, Color color) throws NullPointerException {

        if(origin.equals(null))
            throw new NullPointerException();

        this.origin = origin;
        this.color = color;
        this.edgeColor = DEFAULT_EDGE_COLOR;
        this.edgeWidth = DEFAULT_EDGE_WIDTH;
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
     * @return the edge color.
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
     * @return the edge width.
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
    public cp510.assignments.geoshape.GeoPoint getOrigin() {
        return origin;
    }

    /**
     * Sets the origin of this shape to a given value.
     *
     * @param origin
     */
    public void setOrigin(cp510.assignments.geoshape.GeoPoint origin) throws NullPointerException {
        //this.origin = origin;
        if(origin == null)
            throw new NullPointerException("GeoPoint is null.");

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
        formatted.format(",edgeWidth:=%.4f", edgeWidth);     // 4 decimal places

        return sb.toString();
    }

}
