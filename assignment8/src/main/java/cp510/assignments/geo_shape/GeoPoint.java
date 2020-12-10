package cp510.assignments.geo_shape;

import java.util.Formatter;
import java.util.Objects;

/**
 * Encapsulates a point on a plane.
 *
 * @author Tim
 */
public class GeoPoint
{
    private double xco = 0.0;   // x coordinate
    private double yco = 0.0;   // y coordinate

    /**
     *
     * Constructor with no parameters.
     *
     */
    public GeoPoint() {
    }

    /**
     *
     * Constructor to set the x, y values.
     *
     * @param xco
     * @param yco
     */
    public GeoPoint(double xco, double yco) {
        this.xco = xco;
        this.yco = yco;
    }

    /**
     *
     * Gets the x coordinate.
     *
     * @return xco
     */
    public double getXco() {
        return xco;
    }

    /**
     *
     * Sets the x coordinate.
     *
     * @param xco
     */
    public void setXco(double xco) {
        this.xco = xco;
    }

    /**
     * Gets the y coordinate.
     *
     * @return yco
     */
    public double getYco() {
        return yco;
    }

    /**
     * Sets the y coordinate.
     *
     * @param yco
     */
    public void setYco(double yco) {
        this.yco = yco;
    }

    /**
     * Computes the distance between this point and a given point.
     *
     * @param other
     * @return distance
     */
    public double distance(GeoPoint other) {

        double xDistanceValue = 0;
        double yDistanceValue = 0;

        xDistanceValue = Math.pow((this.xco - other.getXco()), 2);

        yDistanceValue = Math.pow(this.yco - other.getYco(), 2);

        return Math.sqrt(xDistanceValue+yDistanceValue);

    }


    /**
     * Compares this object to a given object.
     * Returns true if this object is equal to
     * the given object
     *
     * @param other The given object.
     *
     * @return True if this object
     *         is equal to the given object,
     *         false otherwise.
     */
    @Override
    public boolean equals( Object other )
    {
        boolean result  = false;
        if ( other == null )
            result = false;
        else if ( this == other )
            result = true;
        else if ( this.getClass() != other.getClass()  )
            result = false;
        else
        {
            GeoPoint    that    = (GeoPoint)other;
            if ( this.xco != that.xco )
                ;
            else if ( this.yco != that.yco )
                ;
            else
                result = true;
        }
        return result;
    }

    /**
     * Returns a hash value for this object.
     *
     * @return  A hash value for this object.
     */
    @Override
    public int hashCode()
    {
        int hash    = Objects.hash( xco, yco );
        return hash;
    }



    /**
     * Returns a string representing the value of this point.
     *
     * @return
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Formatter formatted = new Formatter(sb);
        formatted.format("%.4f", xco);     // 4 decimal places
        formatted.format(",");
        formatted.format("%.4f", yco);

        return "(" +
                formatted +
                ')';
    }

}
