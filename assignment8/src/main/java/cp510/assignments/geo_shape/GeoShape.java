package cp510.assignments.geo_shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Formatter;
import java.util.Objects;

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
    public static final cp510.assignments.geo_shape.GeoPoint DEFAULT_ORIGIN = new cp510.assignments.geo_shape.GeoPoint( 0, 0 );

    /**
     * Properties.
     */
    private cp510.assignments.geo_shape.GeoPoint origin;
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
    GeoShape(cp510.assignments.geo_shape.GeoPoint origin, Color color) throws NullPointerException {

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
     * Uses the given graphics context to draw and/or fill the given shape.
     * It operates according to the following instructions:
     * 1.	If the color property is not null, fill the shape using gtx.fill( Shape ).
     * 2.	If the edgeColor property is not null, and the edgeWidth is greater than 0,
     *      draw the edge of the shape using gtx.draw( Shape ).
     *
     * @param shape
     * @param gtx
     */
    public void draw( Shape shape, Graphics2D gtx ) {

        gtx.setColor( color );
        /*gtx.fill( rect );
        gtx.setColor( Color.BLACK );
        gtx.draw( oval );*/

 //       int width   = 10;
 //       int height  = 15;
 //       gtx.fillRect( 0, 0, width, height );

/*
        gtx.setColor( Color.GREEN );
        gtx.setBackground(Color.ORANGE);

        gtx.fill( shape );
*/

        //System.out.println(shape.toString()+"   ---  9999999999999999999999999999999999999999999");

 //       if(shape instanceof Rectangle2D.Double) {
            if (color != null) {
                //System.out.println("In the rectangle draw.");
                //Rectangle2D rec = (Rectangle2D) shape;

                //draw(gtx);

                gtx.setColor(color);
                gtx.fill(shape);
                //gtx.fillRect( 0, 0, 50, 50 );

                //System.out.println(((Rectangle2D.Double) shape).getWidth());
                //System.out.println((int) ((Rectangle2D.Double) shape).x + "  -  " + (int) ((Rectangle2D.Double) shape).y + "  -  " + (int) rec.getWidth() + "  -  " + (int) rec.getHeight());
                /*
                gtx.fillRect(10, 10, 45, 45);
                gtx.setColor(Color.PINK);
                gtx.fill(shape);

                 */
            }
//        }
//        else {
            if (edgeColor != null && edgeWidth > 0) {


                gtx.setColor(edgeColor);
                gtx.setStroke( new BasicStroke(((float) edgeWidth)) );
                gtx.draw(shape);
            }
 //       }
        //gtx.setColor( Color.BLUE );
        //gtx.fillRect( 0, 0, 50, 50 );


        System.out.println("Shape draw method: " + color + "  _  "+edgeColor+"  _  "+edgeWidth+"\n");
/*
        if (color != null)
                gtx.fill( shape );

        if (edgeColor != null && edgeWidth > 0)
            gtx.draw( shape );
*/
    }


    /**
     *
     *Returns true if a given GeoShape object is not null and the properties
     * it has in common with this object are equal. The common properties are:
     * 	origin
     * 	color
     * 	edgeColor
     * 	edgeWidth
     *
     * @param other
     * @return
     */
    public boolean commonPropertiesEqual( GeoShape other ) {

        boolean properties = false;

        if (other != null){
            if (other.origin == origin && other.color == color && other.edgeColor == edgeColor && other.edgeWidth == edgeWidth)
                properties = true;
        }

        return  properties;
    }


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
    public cp510.assignments.geo_shape.GeoPoint getOrigin() {
        return origin;
    }

    /**
     * Sets the origin of this shape to a given value.
     *
     * @param origin
     */
    public void setOrigin(cp510.assignments.geo_shape.GeoPoint origin) throws NullPointerException {
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



    @Override
    public int hashCode()
    {
        int hash    = Objects.hash( origin, color, edgeColor, edgeWidth );
        return hash;
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
