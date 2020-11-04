package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit tests for the GeoShape class.
 *
 * @author Tim
 */
public class GeoShapeTest {


    /**
     * Validate that the x value is not set to null.
     */
    @Test
    public void xNumNotNull()
    {
        GeoShape shape = new GeoShape();
        assertNotNull(shape.getOrigin().getXco());
    }

    /**
     * Validate that the y value is not set to null.
     */
    @Test
    public void yNumNotNull()
    {
        GeoShape shape = new GeoShape();
        assertNotNull(shape.getOrigin().getYco());
    }

    /**
     * Validate that the color is set correctly.
     */
    @Test
    public void colorSet()
    {
        GeoShape shape = new GeoShape();
        shape.setColor(Color.RED);
        assertEquals(Color.RED, shape.getColor());
    }


    /**
     * Validate that the x value is set correctly.
     */
    @Test
    public void validXOrigin()
    {
        GeoShape shape = new GeoShape();
        shape.getOrigin().setXco(5);
        assertTrue(5 == shape.getOrigin().getXco() );
    }

    /**
     * Validate that the y value is set correctly.
     */
    @Test
    public void validYOrigin()
    {
        GeoShape shape = new GeoShape();
        shape.getOrigin().setYco(5);
        assertTrue(5 == shape.getOrigin().getYco() );
    }

    /**
     * Validate that the x point value is set correctly.
     */
    @Test
    public void validOriginSetX()
    {
        GeoPoint point = new GeoPoint();

        point.setXco(1);

        GeoShape shape = new GeoShape();
        shape.setOrigin(point);

        assertTrue(1 == shape.getOrigin().getXco() );
    }

    /**
     * Validate that the y point value is set correctly.
     */
    @Test
    public void validOriginSetY()
    {
        GeoPoint point = new GeoPoint();

        point.setYco(2);

        GeoShape shape = new GeoShape();
        shape.setOrigin(point);

        assertTrue(2 == shape.getOrigin().getYco() );
    }

    /**
     * Validate the toString method with a Color set.
     */
    @Test
    public void validShapeWithColorToString()
    {
        GeoPoint point = new GeoPoint();
        GeoShape shape = new GeoShape();

        point.setXco(1);
        point.setYco(2);

        shape.setOrigin( point );
        System.out.println( shape );
        shape.setColor( Color.RED );
        System.out.println( shape );
        assertTrue( "origin=(1.0000,2.0000),color=#FF0000"
                .equals(shape.toString()) );
    }

    /**
     * Validate the toString method with a null Color.
     */
    @Test
    public void validShapeWithNullColorToString()
    {
        GeoPoint point = new GeoPoint();
        GeoShape shape = new GeoShape();

        point.setXco(1);
        point.setYco(2);

        shape.setOrigin( point );
        System.out.println( shape );
        shape.setColor( null );
        System.out.println( shape );
        assertEquals( "origin=(1.0000,2.0000),color=null", shape.toString() );
    }


    /**
     * Validate that constructor with GeoPoint object is valid.
     */
    @Test
    public void shapeConstructorWithGeoPoint()
    {
        GeoPoint point = new GeoPoint();
        GeoShape shape = new GeoShape(point);
        assertNotNull(shape);
    }

    /**
     * Validate that constructor with GeoPoint and Color object is valid.
     */
    @Test
    public void shapeConstructorWithGeoPointAndColor()
    {
        GeoPoint point = new GeoPoint();
        Color color = Color.BLUE;
        GeoShape shape = new GeoShape(point, color);
        assertNotNull(shape);
    }

}
