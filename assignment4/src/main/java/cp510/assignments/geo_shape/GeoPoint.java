package cp510.assignments.geo_shape;

import java.text.DecimalFormat;
import java.util.Formatter;


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
     * Returns a string representing the value of this point.
     *
     * @return
     */
    @Override
    public String toString() {

        // best way to format floating point numbers in Java
        // beware it also round the numbers
/*
        DecimalFormat dfcXco = new DecimalFormat("#.####");
        String formattedXco = dfcXco.format(xco);
        DecimalFormat dfYco = new DecimalFormat("#.####");
        String formattedYco = dfYco.format(yco);
*/

        StringBuilder sb = new StringBuilder();
        Formatter formatted = new Formatter(sb);
        formatted.format("%.4f", xco);     // 4 decimal places
        formatted.format(",");
        formatted.format("%.4f", yco);

        /*
        Formatter formattedYco = new Formatter(sb);
        formattedYco.format("%.4f", yco);     // 4 decimal places
*/


        return "(" +
                formatted +
                ')';
    }
}
