package cp510.assignments.geo_shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Formatter;
import java.util.Objects;

/**
 * Encapsulates a rectangle.
 *
 * @author Tim
 */
public class GeoRectangle extends GeoShape {

    private double width;
    private double height;

    /**
     *
     * Constructor with parameters width, height.
     *
     * @param width
     * @param height
     */
    public GeoRectangle(double width, double height) {
        this(GeoShape.DEFAULT_ORIGIN, GeoShape.DEFAULT_COLOR, width, height);
    }

    /**
     *
     * Constructor with parameters origin, width, height.
     *
     * @param origin
     * @param width
     * @param height
     */
    public GeoRectangle(GeoPoint origin, double width, double height) {
        this(origin, GeoShape.DEFAULT_COLOR, width, height);
    }

    /**
     *
     * Constructor with parameters origin, color, width, height.
     *
     * @param origin
     * @param color
     * @param width
     * @param height
     * @throws NullPointerException
     */
    public GeoRectangle(GeoPoint origin, Color color, double width,
                        double height) throws NullPointerException {
        super(origin, color);
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width of this rectangle.
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of this rectangle to a given value.
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the height of this rectangle.
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of this rectangle to a given value.
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the area of this rectangle.
     *
     * @return area
     */
    public double area() {
        return width*height;
    }

    /**
     * Returns the perimeter of this rectangle.
     *
     * @return perimeter
     */
    public double perimeter() {
        return width+width+height+height;
    }


    /**
     *
     * Draw the current object.
     * 1. Instantiate and initialize a Rectangle2D.Double object.
     * 2. Pass the Rectangle2D object to the draw( Shape, Graphics2D )
     * method method in the GeoShape class.
     *
     * @param gtx
     */
    @Override
    public void draw(Graphics2D gtx) {

        Rectangle2D.Double rec = new Rectangle2D.Double();

        //Rectangle2D.Double rec2 = new Shape();

        System.out.println("REC details: "+this.getOrigin().getXco()+"     "+this.getOrigin().getYco()+"     "+width+"     "+height);
        rec.setRect(this.getOrigin().getXco(), this.getOrigin().getYco(), width, height);

        draw(rec, gtx);
        //draw(this, gtx);

        //System.out.println("Drawing rectangle: " + this.toString());



    }


    /**
     *
     * Calculates and returns a hashcode for this object.
     *
     * @return a has of this object.
     */
    @Override
    public int hashCode()
    {
        int hash    = Objects.hash( super.hashCode(), width, height );
        return hash;
    }


    /**
     * Returns a string describing the properties of this GeoRectangle.
     *
     * @return
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Formatter formatted = new Formatter(sb);
        formatted.format("width=%.4f", width);     // 4 decimal places
        formatted.format(",");
        formatted.format("height=%.4f", height);

        return super.toString()+
                "," +
                formatted;
    }

}
