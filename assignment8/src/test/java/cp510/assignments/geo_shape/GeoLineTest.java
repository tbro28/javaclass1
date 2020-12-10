package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.util.Map;

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
        GeoPoint point = new GeoPoint();
        point.setXco(100);
        GeoLine line = new GeoLine(point, point);
        line.setEnd(point);
        assertEquals(point.getXco(), line.getEnd().getXco());
    }

    /**
     * Validate that the y end value is set correctly.
     */
    @Test
    public void geoLineSetEndY() {
        GeoPoint point = new GeoPoint();
        point.setYco(200);
        GeoLine line = new GeoLine(point, point);
        line.setEnd(point);
        assertEquals(point.getXco(), line.getEnd().getXco());
    }

    /**
     * Validate that the end point can be set to null.
     */
    @Test
    public void geoLineSetEndNull() {
        GeoPoint point = new GeoPoint();
        point.setYco(200);
        GeoLine line = new GeoLine(point, point);
        assertThrows(NullPointerException.class, () -> line.setEnd(null));
    }

    /**
     * Validate that the x start value is set correctly.
     */
    @Test
    public void geoLineSetStartX() {
        GeoPoint point = new GeoPoint();
        point.setXco(100);
        GeoLine line = new GeoLine(point, point);
        line.setStart(point);
        assertEquals(point.getXco(), line.getStart().getXco());
    }

    /**
     * Validate that the y start value is set correctly.
     */
    @Test
    public void geoLineSetStartY() {
        GeoPoint point = new GeoPoint();
        point.setYco(20);
        GeoLine line = new GeoLine(point, point);
        line.setStart(point);
        assertEquals(point.getYco(), line.getStart().getYco());
    }

    /**
     * Validate that the length calculation is correct.
     */
    @Test
    public void geoLineLength() {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();
        point1.setXco(20);
        point1.setYco(20);
        point2.setXco(200);
        point2.setYco(200);
        double area = 0;
        GeoLine line = new GeoLine(point1, point2);
        line.setStart(point1);
        line.setEnd(point2);
        DecimalFormat df = new DecimalFormat("#.###");
        String formatted = df.format(line.length());
        assertEquals("254.558", formatted);
    }


    /**
     * Validate the 3 parameter constructor with width.
     */
    @Test
    public void geoLineConstructorWidth() {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();
        point1.setXco(20);
        point1.setYco(20);
        point2.setXco(200);
        point2.setYco(200);
        double area = 0;
        GeoLine line = new GeoLine(point1, point2, 5);
        line.setStart(point1);
        line.setEnd(point2);
        DecimalFormat df = new DecimalFormat("#.###");
        String formatted = df.format(line.length());
        assertEquals("254.558", formatted);
    }

    /**
     * Validate the equals method returns true.
     */
    @Test
    public void geoLineEqualsTrue() {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();
        point1.setXco(20);
        point1.setYco(20);
        point2.setXco(200);
        point2.setYco(200);

        GeoLine line1 = new GeoLine(point1, point2, 5);
        GeoLine line2 = new GeoLine(point1, point2, 5);

        assertTrue(line1.equals(line2));
    }

    /**
     * Validate the equals method returns false with null.
     */
    @Test
    public void geoLineNotEqualsNull() {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();
        point1.setXco(20);
        point1.setYco(20);
        point2.setXco(200);
        point2.setYco(200);

        GeoLine line1 = new GeoLine(point1, point2, 5);

        assertFalse(line1.equals(null));
    }

    /**
     * Validate the hashcode method returns a valid hash.
     */
    @Test
    public void geoLineHashcodeValue() {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();
        point1.setXco(20);
        point1.setYco(20);
        point2.setXco(200);
        point2.setYco(200);

        GeoLine line1 = new GeoLine(point1, point2, 5);

        System.out.println(line1.hashCode());
        assertEquals(-1459858273,line1.hashCode());
    }

    /**
     * Validate the draw method.
     */
    @Test
    public void lineDraw() {

        GeoPlane plane = new GeoPlane();
        GeoLine line = new GeoLine(new GeoPoint(225, 25),
                new GeoPoint(225, 225), Color.RED, 1);

        plane.addShape(line);
        plane.show();

        JFrame frame = new JFrame();

        int n = JOptionPane.showConfirmDialog(
                frame,
                "Do you see a vertical line that is red?",
                "Line Question",
                JOptionPane.YES_NO_OPTION);

        assertEquals(0, n);
    }


    /**
     * Validate that the GeoLine string is formatted correctly.
     */
    @Test
    public void geoLineToString() {
        GeoPoint point1 = new GeoPoint();
        GeoPoint point2 = new GeoPoint();
        point1.setXco(20);
        point1.setYco(20);
        point2.setXco(200);
        point2.setYco(200);
        double area = 0;
        GeoLine line = new GeoLine(point1, point2);
        line.setStart(point1);
        line.setEnd(point2);
        line.setColor(Color.BLUE);

        assertEquals("origin=(20.0000,20.0000),color=#0000FF," +
                "edgeColor=#000000,edgeWidth:=1.0000,end=(200.0000,200.0000)",
                line.toString());
    }

}
