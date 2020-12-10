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
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the GeoRectangle class.
 *
 * @author Tim
 */
public class GeoRectangleTest {

    /**
     * Validate that the width value is set correctly.
     */
    @Test
    public void rectangleWidth() {
        GeoRectangle rectangle = new GeoRectangle(0, 0);
        rectangle.setWidth(5.5);
        assertEquals(5.5, rectangle.getWidth());
    }

    /**
     * Validate that the height value is set correctly.
     */
    @Test
    public void rectangleHeight() {
        GeoRectangle rectangle = new GeoRectangle(0, 0);
        rectangle.setHeight(5.5);
        assertEquals(5.5, rectangle.getHeight());
    }

    /**
     * Validate that the area calculation is correct.
     */
    @Test
    public void rectangleArea() {
        GeoRectangle rectangle = new GeoRectangle(0, 0);
        rectangle.setWidth(5.5);
        rectangle.setHeight(5.5);
        assertEquals(30.25, rectangle.area());
    }

    /**
     * Validate that the perimeter calculation is correct.
     */
    @Test
    public void rectanglePerimeter() {
        GeoRectangle rectangle = new GeoRectangle(0, 0);
        rectangle.setWidth(5.5);
        rectangle.setHeight(5.5);
        assertEquals(22, rectangle.perimeter());
    }

    /**
     * Validate that the GeoRectangle string is formatted correctly.
     */
    @Test
    public void rectangleString() {
        GeoRectangle rectangleStr = new GeoRectangle(0, 0);
        rectangleStr.setWidth(555.55555);
        rectangleStr.setHeight(333.33333);
        rectangleStr.setOrigin(new GeoPoint(0, 0));
        assertEquals("origin=(0.0000,0.0000),color=#0000FF," +
                "edgeColor=#000000,edgeWidth:=1.0000,width=555.5556," +
                "height=333.3333", rectangleStr.toString());
    }

    /**
     * Validate that the 3 parameter constructor.
     */
    @Test
    public void rectangleThreeParamsConstructor() {
        GeoPoint origin = new GeoPoint();
        GeoRectangle rectangle = new GeoRectangle(origin, 0, 0);
        assertNotNull(rectangle);
    }

    /**
     * Validate that two of the same rectangles are equal.
     */
    @Test
    public void rectangleEqualsTrue() {

        GeoRectangle rec1 = new GeoRectangle( new GeoPoint(10, 10),
                Color.BLACK, 25, 50);
        GeoRectangle rec2 = new GeoRectangle( new GeoPoint(10, 10),
                Color.BLACK, 25, 50);

        assertTrue(rec1.equals(rec2));

    }

    /**
     * Validate that null rectangle returns false.
     */
    @Test
    public void rectangleNotEqualsNull() {

        GeoRectangle rec1 = new GeoRectangle( new GeoPoint(10, 10),
                Color.BLACK, 25, 50);

        assertFalse(rec1.equals(null));

    }

    /**
     * Validate the hashcode method.
     */
    @Test
    public void rectangleHashcode() {

        GeoRectangle rec1 = new GeoRectangle( new GeoPoint(10, 10),
                Color.BLACK, 25, 50);

        assertEquals(-1821909889, rec1.hashCode());

    }

    /**
     * Validate the draw method.
     */
    @Test
    public void rectangleDraw() {

        GeoPlane plane = new GeoPlane();
        GeoRectangle rect = new GeoRectangle(new GeoPoint(25, 25),
                Color.BLACK, 100, 75);
        rect.setEdgeColor(Color.BLUE);
        rect.setEdgeWidth(1);

        plane.addShape(rect);
        plane.show();

        JFrame frame = new JFrame();

        int n = JOptionPane.showConfirmDialog(
                frame,
                "Do you see a rectangle that is filled with black " +
                        "and has a blue border?",
                "Rectangle Question",
                JOptionPane.YES_NO_OPTION);

        assertEquals(0, n);
    }

}
