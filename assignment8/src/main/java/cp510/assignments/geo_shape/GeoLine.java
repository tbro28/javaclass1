package cp510.assignments.geo_shape;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * Encapsulates a line.
 *
 * @author Tim
 */
public class GeoLine extends GeoShape {

    /**
     * End point of the line.
     */
    private GeoPoint end;

    /**
     *
     * Sets the start and endpoints of this line to the given values.
     * Sets the edgeColor and edgeWidth properties to the defaults
     * (DEFAULT_EDGE_COLOR and DEFAULT_EDGE_WIDTH) and sets the color
     * property to null.
     *
     * @param start
     * @param end
     * @throws NullPointerException
     */
    public GeoLine(GeoPoint start, GeoPoint end) throws NullPointerException {
        this(start, end, GeoShape.DEFAULT_EDGE_COLOR,
                GeoShape.DEFAULT_EDGE_WIDTH);
    }

    /**
     *
     *Sets the start point, endpoint and edgeWidth
     * properties of this line to the given values.
     * Sets the edgeColor property to the default
     * (DEFAULT_EDGE_COLOR) and sets the color property
     * to null. It is required that this constructor chain
     * to the four-parameter constructor.
     *
     * @param start
     * @param end
     * @param width
     * @throws NullPointerException
     */
    public GeoLine(GeoPoint start, GeoPoint end,
                   double width) throws NullPointerException {
        this(start, end, GeoShape.DEFAULT_EDGE_COLOR, width);
    }

    /**
     *
     * Sets the properties of this line to the given values;
     * the color property is explicitly set to null.
     *
     * @param start
     * @param end
     * @param edgeColor
     * @param width
     * @throws NullPointerException
     */
    public GeoLine(GeoPoint start, GeoPoint end,
                   Color edgeColor, double width) throws NullPointerException {
        super(start, edgeColor);
        this.end = end;
        this.setEdgeWidth(width);
        this.setEdgeColor(edgeColor);
        this.setColor(null);
    }

    /**
     * Returns the endpoint of this line.
     *
     * @return end
     */
    public GeoPoint getEnd() {
        return end;
    }

    /**
     * Sets the endpoint of this line to the given value.
     *
     * @param end
     * @throws NullPointerException
     */
    public void setEnd( GeoPoint end ) throws NullPointerException {

        if(end == null)
            throw new NullPointerException();
        else
            this.end = end;
    }

    /**
     * Returns the starting point of this line.
     *
     * @return origin
     */
    public GeoPoint getStart() {
        return super.getOrigin();
    }

    /**
     * Sets the starting point of the line.
     *
     * @param start
     */
    public void setStart( GeoPoint start ) {
        super.setOrigin(start);
    }

    /**
     * Returns the length of this line.
     *
     * @return length
     */
    public double length() {

        double x = Math.pow((end.getXco() - getStart().getXco()), 2);
        double y = Math.pow((end.getYco() - getStart().getYco()), 2);
        double c = Math.sqrt((x+y));

        return c;
    }

    /**
     *
     *Draws this line. For this part of your project
     * simply print "Drawing line: " followed by
     * the string returned by toString().
     *
     * @param gtx
     */
    @Override
    public void draw(Graphics2D gtx) {

        double x = Math.pow((end.getXco() - getStart().getXco()), 2);
        double y = Math.pow((end.getYco() - getStart().getYco()), 2);

        Line2D.Double line = new Line2D.Double();

        //System.out.println("LINE!!!!!!");
        line.setLine(getStart().getXco(), getStart().getYco(), end.getXco(), end.getYco());

        draw(line, gtx);

        //System.out.println("Drawing line: " + this.toString());
    }

    /**
     *
     * This method overrides the GeoShape.setColor(Color) method.
     * It does nothing. It is present merely to prevent the color
     * property in the GeoShape class from being set to a non-null value:
     *
     * @param color
     */
    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    /**
     * Returns a string describing the properties of this line.
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() +
                "," +
                "end=" + end;
    }

}
