package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit tests for the GeoOval class.
 *
 * @author Tim
 */
public class GeoOvalTest {

    /**
     * Validate that the area calculation is correct.
     */
    @Test
    public void ovalArea() {
        GeoOval oval = new GeoOval();
        assertEquals(0, oval.area());
    }

    /**
     * Validate that the perimeter calculation is correct.
     */
    @Test
    public void ovalPerimeter() {
        GeoOval oval = new GeoOval();
        assertEquals(0, oval.perimeter());
    }

}
