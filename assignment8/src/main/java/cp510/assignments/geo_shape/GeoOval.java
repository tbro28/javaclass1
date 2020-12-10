package cp510.assignments.geo_shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * Encapsulates an oval.
 *
 * @author Tim
 */
public class GeoOval extends GeoRectangle {
    //public class GeoOval extends cp510.assignments.geo_shape.GeoRectangle {
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
        this(DEFAULT_ORIGIN, DEFAULT_COLOR, width, height);

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
        this(origin, DEFAULT_COLOR, width, height);
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

        this.getOrigin().getXco();
        this.getOrigin().getYco();
        this.getWidth();
        this.getHeight();

        Ellipse2D.Double oval = new Ellipse2D.Double();

        //System.out.println("LINE!!!!!!");
        oval.setFrame(this.getOrigin().getXco(), this.getOrigin().getYco(), this.getWidth(), this.getHeight());

        draw(oval, gtx);

        //System.out.println("Drawing line: " + this.toString());






        System.out.println("Drawing oval: " + this.toString());
    }

    /**
     * Returns the approximate area of this oval.
     *
     * @return area
     */
    public double area() {

        double area = (this.getWidth()/2) * (this.getHeight()/2) * Math.PI;


        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.HALF_UP);

        return Double.parseDouble(df.format(area));
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
     *
     * Calculates and returns a hashcode for this object.
     *
     * @return a has of this object.
     */
    @Override
    public int hashCode()
    {
        int hash    = Objects.hash( super.hashCode() );
        return hash;
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
