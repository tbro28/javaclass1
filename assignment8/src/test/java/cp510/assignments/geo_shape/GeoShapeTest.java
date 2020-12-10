package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

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
        GeoShape shape = new GeoRectangle(0, 0);
        assertNotNull(shape.getOrigin().getXco());
    }

    /**
     * Validate that the y value is not set to null.
     */
    @Test
    public void yNumNotNull()
    {
        GeoShape shape = new GeoRectangle(0, 0);
        assertNotNull(shape.getOrigin().getYco());
    }

    /**
     * Validate that the color is set correctly.
     */
    @Test
    public void colorSet()
    {
        GeoShape shape = new GeoRectangle(0, 0);
        shape.setColor(Color.RED);
        assertEquals(Color.RED, shape.getColor());
    }


    /**
     * Validate that the x value is set correctly.
     */
    @Test
    public void validXOrigin()
    {
        GeoShape shape = new GeoRectangle(0, 0);
        shape.getOrigin().setXco(5);
        assertTrue(5 == shape.getOrigin().getXco() );
    }

    /**
     * Validate that the y value is set correctly.
     */
    @Test
    public void validYOrigin()
    {
        GeoShape shape = new GeoRectangle(0, 0);
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

        GeoShape shape = new GeoRectangle(0, 0);
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

        GeoShape shape = new GeoRectangle(0, 0);
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
        GeoShape shape = new GeoRectangle(0, 0);

        point.setXco(1);
        point.setYco(2);

        shape.setOrigin( point );
        shape.setColor( Color.RED );
        assertEquals( "origin=(1.0000,2.0000),color=#FF0000," +
                "edgeColor=#000000,edgeWidth:=1.0000,width=0.0000," +
                "height=0.0000", shape.toString() );
    }

    /**
     * Validate the toString method with a null Color.
     */
    @Test
    public void validShapeWithNullColorToString()
    {
        GeoPoint point = new GeoPoint();
        GeoShape shape = new GeoRectangle(0, 0);

        point.setXco(1);
        point.setYco(2);

        shape.setOrigin( point );
        shape.setColor( null );
        assertEquals( "origin=(1.0000,2.0000),color=null," +
                        "edgeColor=#000000,edgeWidth:=1.0000,width=0.0000," +
                        "height=0.0000",
                shape.toString() );
    }

    /**
     * Validate that constructor with GeoPoint object is valid.
     */
    @Test
    public void shapeConstructorWithGeoPoint()
    {
        GeoPoint point = new GeoPoint();
        GeoShape shape = new GeoRectangle(0, 0);
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
        GeoShape shape = new GeoRectangle(point, color, 0, 0);
        assertNotNull(shape);
    }

    /**
     * Validate that constructor with GeoPoint and Color object is valid.
     */
    @Test
    public void shapeConstructorPointNullException()
    {
        Color color = Color.BLUE;
        assertThrows(NullPointerException.class,
                () -> new GeoRectangle(null, color, 0, 0));
    }

    /**
     * Verify the get edge color.
     */
    @Test
    public void shapeGetEdgeColor()
    {
        GeoPoint point = new GeoPoint();
        Color color = Color.BLUE;
        Color edgeColor = Color.RED;
        GeoShape shape = new GeoRectangle(point, color, 0, 0);
        shape.setEdgeColor(edgeColor);
        assertEquals(edgeColor, shape.getEdgeColor());
    }

    /**
     * Validate the getEdgeWidth method.
     */
    @Test
    public void shapeGetEdgeWidthMethod()
    {
        GeoPoint point = new GeoPoint();
        Color color = Color.BLUE;
        GeoShape shape = new GeoRectangle(point, color, 0, 0);
        shape.setEdgeWidth(10);

        assertEquals(10, shape.getEdgeWidth());
    }


}
