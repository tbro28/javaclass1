package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;
import java.awt.*;
import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the GeoLine class.
 *
 * @author Tim
 */
public class GeoLineTest {

    /**
     * Validate that the x end value is set correctly.
     */
    @Test
    public void geoLineSetEndX() {
        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        point.setXco(100);
        line.setEnd(point);
        assertEquals(point.getXco(), line.getEnd().getXco());
    }

    /**
     * Validate that the y end value is set correctly.
     */
    @Test
    public void geoLineSetEndY() {
        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        point.setYco(200);
        line.setEnd(point);
        assertEquals(point.getXco(), line.getEnd().getXco());
    }

    /**
     * Validate that the end point can be set to null.
     */
    @Test
    public void geoLineSetEndNull() {
        GeoLine line = new GeoLine();
        assertThrows(NullPointerException.class, () -> line.setEnd(null));
    }

    /**
     * Validate that the x start value is set correctly.
     */
    @Test
    public void geoLineSetStartX() {
        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        point.setXco(100);
        line.setStart(point);
        assertEquals(point.getXco(), line.getStart().getXco());
    }

    /**
     * Validate that the y start value is set correctly.
     */
    @Test
    public void geoLineSetStartY() {

        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        point.setYco(20);
        line.setStart(point);
        assertEquals(point.getYco(), line.getStart().getYco());
    }

    /**
     * Validate that the length calculation is correct.
     */
    @Test
    public void geoLineLength() {

        double area = 0;
        GeoLine line = new GeoLine();
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();
        point1.setXco(20);
        point1.setYco(20);
        point2.setXco(200);
        point2.setYco(200);
        line.setStart(point1);
        line.setEnd(point2);
        DecimalFormat df = new DecimalFormat("#.###");
        String formatted = df.format(line.length());
        assertEquals("254.558", formatted);
    }

    /**
     * Validate that the GeoLine string is formatted correctly.
     */
    @Test
    public void geoLineToString() {

        double area = 0;
        GeoLine line = new GeoLine();
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();
        point1.setXco(20);
        point1.setYco(20);
        point2.setXco(200);
        point2.setYco(200);
        line.setStart(point1);
        line.setEnd(point2);
        line.setColor(Color.BLUE);

        assertEquals("origin=(20.0000,20.0000),color=#0000FF," +
                "end=(200.0000,200.0000)", line.toString());
    }

}
