package cp510.assignments.geo_shape;

//import static org.junit.Assert.assertTrue;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the GeoPoint class.
 */
public class GeoPointTest
{

    /**
     * Validate that the x value is set correctly.
     */
    @Test
    public void validXNumber()
    {
        GeoPoint point = new GeoPoint();
        point.setXco(1);
        assertTrue(1 == point.getXco() );
    }

    /**
     * Validate that the y value is set correctly.
     */
    @Test
    public void validYNumber()
    {
        GeoPoint point = new GeoPoint();
        point.setYco(1);
        assertTrue(1 == point.getYco() );
    }

    /**
     * Validate that the distance value is calculated correctly.
     */
    @Test
    public void validDistanceCalculation()
    {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();

        point1.setXco(5);
        point1.setYco(5);
        point2.setXco(10);
        point2.setYco(10);

        DecimalFormat dfDistance = new DecimalFormat("#.######");
        double distance = Double.parseDouble(dfDistance
                .format(point1.distance(point2)));
        System.out.println(distance);

        assertTrue(7.071068 == distance );
    }

    /**
     * Validate the toString method.
     */
    @Test
    public void validPointToString()
    {
        GeoPoint point = new GeoPoint();

        point.setXco(1);
        point.setYco(2);

        System.out.println(point);

        assertTrue( "(1.0000,2.0000)".equals(point.toString()) );
    }


}
