package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the GeoPlane class.
 *
 * @author Tim
 */
public class GeoPlaneTest {

    /**
     * Validate that the background color default is set correctly.
     */
    @Test
    public void validDefaultBackgroundColor()
    {
        GeoPlane plane = new GeoPlane();

        assertEquals( Color.GRAY, plane.getBackgroundColor() );
    }

    /**
     * Validate that the background color is set correctly.
     */
    @Test
    public void validChangingBackgroundColor()
    {
        GeoPlane plane = new GeoPlane();

        plane.setBackgroundColor(Color.GREEN);

        assertEquals( Color.GREEN, plane.getBackgroundColor() );
    }

    /**
     * Validate that the show method.
     */
    @Test
    public void validShow()
    {
        GeoPlane plane = new GeoPlane();
        plane.show();
        assertTrue(true);
    }

    /**
     * Validate that the addShape method.
     */
    @Test
    public void validAddShape()
    {
        GeoPlane plane = new GeoPlane();
        GeoShape shape = new GeoShape();
        plane.addShape(shape);
        assertTrue(true);
    }

    /**
     * Validate that the removeShape method.
     */
    @Test
    public void validRemoveShape()
    {
        GeoPlane plane = new GeoPlane();
        GeoShape shape = new GeoShape();
        plane.removeShape(shape);
        assertTrue(true);
    }

    /**
     * Validate that the redraw method.
     */
    @Test
    public void validRedraw()
    {
        GeoPlane plane = new GeoPlane();
        plane.redraw();
        assertTrue(true);
    }

}
