package cp510.assignments;

import java.awt.*;

/**
 * Encapsulates an oval.
 *
 * @author Tim
 */
public class GeoOval extends GeoRectangle {

    public GeoOval(double width, double height) {
        this(GeoShape.DEFAULT_ORIGIN, GeoShape.DEFAULT_COLOR, width, height);

    }

    public GeoOval(GeoPoint origin, double width, double height) {
        this(origin, GeoShape.DEFAULT_COLOR, width, height);
    }

    public GeoOval(GeoPoint origin, Color color, double width, double height) throws NullPointerException {
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

}
