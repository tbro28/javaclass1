package cp510.assignments.geo_shape;


import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the GeoPlane class.
 */
public class GeoPlaneTest {

    /**
     * Validate that the background color default is set correctly.
     */
    @Test
    public void validDefaultBackgroundColor()
    {
        GeoPlane plane = new GeoPlane();

        System.out.println(plane.getBackgroundColor());
        System.out.println(Color.gray);
        assertEquals( Color.GRAY, plane.getBackgroundColor() );
    }

    /**
     * Validate that the background color is set correctly.
     */
    @Test
    public void validChaningBackgroundColor()
    {
        GeoPlane plane = new GeoPlane();

        plane.setBackgroundColor(Color.GREEN);

        assertEquals( Color.GREEN, plane.getBackgroundColor() );
    }

}
