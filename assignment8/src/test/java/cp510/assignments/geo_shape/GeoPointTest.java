package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

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

        assertTrue( "(1.0000,2.0000)".equals(point.toString()) );
    }

    /**
     * Validate the no argument constructor.
     */
    @Test
    public void validNoArgumentConstructor()
    {
        GeoPoint point = new GeoPoint();
        assertNotNull(point);
    }

    /**
     * Validate the two argument constructor.
     */
    @Test
    public void validTwoArgumentConstructor()
    {
        GeoPoint point = new GeoPoint(1, 1);
        assertNotNull(point);
    }

    /**
     * Validate the same x and y values.
     */
    @Test
    public void validEqualsSameValues()
    {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();

        point1.setXco(5);
        point1.setYco(10);
        point2.setXco(5);
        point2.setYco(10);

        assertTrue(point1.equals(point2) );
    }

    /**
     * Validate the different x values.
     */
    @Test
    public void validNotEqualsDifferentXValues()
    {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();

        point1.setXco(5);
        point1.setYco(10);
        point2.setXco(10);
        point2.setYco(10);

        assertFalse(point1.equals(point2) );
    }

    /**
     * Validate the different y values.
     */
    @Test
    public void validNotEqualsNullValue()
    {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();

        point1.setXco(5);
        point1.setYco(5);
        point2.setXco(5);
        point2.setYco(10);

        assertFalse(point1.equals(point2) );
    }

    /**
     * Validate the Equals null returns false.
     */
    @Test
    public void validNotEqualsDifferentYValues()
    {
        GeoPoint point1 = new GeoPoint();

        point1.setXco(5);
        point1.setYco(5);

        assertFalse(point1.equals(null) );
    }

    /**
     * Validate the hashcode method.
     */
    @Test
    public void validHashCode()
    {
        GeoPoint point1 = new GeoPoint();

        point1.setXco(5);
        point1.setYco(10);

        assertEquals(42992577, point1.hashCode() );
    }

}
