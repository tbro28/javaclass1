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
        GeoOval oval = new GeoOval(0, 0);
        assertEquals(0, oval.area());
    }

    /**
     * Validate that the perimeter calculation is correct.
     */
    @Test
    public void ovalPerimeter() {
        GeoOval oval = new GeoOval(0, 0);
        assertEquals(0, oval.perimeter());
    }

    /**
     * Validate the constructor is correct.
     */
    @Test
    public void ovalConstructor() {
        GeoPoint point = new GeoPoint();
        GeoOval oval = new GeoOval(point, 0, 0);
        assertNotNull(oval);
    }

    /**
     * Validate that the equals method returns true.
     */
    @Test
    public void ovalEqualsTrue() {
        GeoOval oval1 = new GeoOval(50, 25);
        GeoOval oval2 = new GeoOval(50, 25);

        assertTrue(oval1.equals(oval2));
    }

    /**
     * Validate that the equals method returns false with null.
     */
    @Test
    public void ovalNotEqualsNull() {
        GeoOval oval1 = new GeoOval(50, 25);

        assertFalse(oval1.equals(null));
    }

    /**
     * Validate the draw method.
     */
    @Test
    public void ovalDraw() {

        GeoPlane plane = new GeoPlane();
        GeoOval oval = new GeoOval(new GeoPoint(25, 25),
                Color.BLACK, 100, 75);
        oval.setEdgeColor(Color.BLUE);
        oval.setEdgeWidth(1);

        plane.addShape(oval);
        plane.show();

        JFrame frame = new JFrame();

        int n = JOptionPane.showConfirmDialog(
                frame,
                "Do you see an oval that is filled with black " +
                        "and has a blue border?",
                "Oval Question",
                JOptionPane.YES_NO_OPTION);

        assertEquals(0, n);
    }

}
