package cp510.assignments.geoshape;

import java.awt.*;

/**
 * Encapsulates an oval.
 *
 * @author Tim
 */
public class GeoOval extends GeoRectangle {

    /**
     *
     * Sets the width and height of this oval to the given values.
     * Sets the origin and color properties to the defaults
     * (DEFAULT_ORIGIN and DEFAULT_COLOR). It is required that
     * this constructor chains to the four-parameter constructor.
     *
     * @param width
     * @param height
     */
    public GeoOval(double width, double height) {
        this(GeoShape.DEFAULT_ORIGIN, GeoShape.DEFAULT_COLOR, width, height);

    }

    /**
     *
     * Sets the origin, width and height of this oval to the given values.
     * Sets the color property to the default (DEFAULT_COLOR). It is
     * required that this constructor chains to the four-parameter constructor.
     *
     * @param origin
     * @param width
     * @param height
     */
    public GeoOval(GeoPoint origin, double width, double height) {
        this(origin, GeoShape.DEFAULT_COLOR, width, height);
    }

    /**
     *
     * Constructor with 4 parameters.
     *
     * @param origin
     * @param color
     * @param width
     * @param height
     * @throws NullPointerException
     */
    public GeoOval(GeoPoint origin, Color color,
                   double width, double height) throws NullPointerException {
        super(origin, color, width, height);
    }


    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing oval: " + this.toString());
    }

    /**
     * Returns the approximate area of this oval.
     *
     * @return area
     */
    public double area() {
        return 0;
    }

    /**
     * Returns the approximate perimeter of this oval.
     *
     * @return perimeter
     */
    public double perimeter() {
        return 0;
    }

    /**
     * Returns a string describing the properties of this GeoOval.
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
