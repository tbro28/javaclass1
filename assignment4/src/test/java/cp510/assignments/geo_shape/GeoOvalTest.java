package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit tests for the GeoOval class.
 */
public class GeoOvalTest {

    @Test
    public void ovalArea() {
        GeoOval oval = new GeoOval();
        assertEquals(0, oval.area());
    }

    @Test
    public void ovalPerimeter() {
        GeoOval oval = new GeoOval();
        assertEquals(0, oval.perimeter());
    }



}
