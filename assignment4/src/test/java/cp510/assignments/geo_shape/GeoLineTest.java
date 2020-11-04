package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;
import java.awt.*;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the GeoLine class.
 */
public class GeoLineTest {

    @Test
    public void geoLineSetEndX() {
        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        point.setXco(100);
        line.setEnd(point);
        assertEquals(point.getXco(), line.getEnd().getXco());
    }

    @Test
    public void geoLineSetEndY() {
        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        point.setYco(200);
        line.setEnd(point);
        assertEquals(point.getXco(), line.getEnd().getXco());
    }

    @Test
    public void geoLineSetEndNull() {
        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        //point.setYco(null);
        point = null;
        line.setEnd(point);
        line.setEnd(null);

 //       System.out.println(line.getEnd());
        assertNull(line.getEnd());
//        assertEquals(point, line.getEnd());
    }


    @Test
    public void geoLineSetStartX() {
        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        point.setXco(100);
        line.setStart(point);
        assertEquals(point.getXco(), line.getStart().getXco());
    }

    @Test
    public void geoLineSetStartY() {

        GeoLine line = new GeoLine();
        GeoPoint point = new GeoPoint();
        point.setYco(20);
        line.setStart(point);
        assertEquals(point.getYco(), line.getStart().getYco());
    }


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
        System.out.println(line.toString());

        assertEquals("origin=(20.0000,20.0000),color=#0000FF," +
                "end=(200.0000,200.0000)", line.toString());
    }


}
