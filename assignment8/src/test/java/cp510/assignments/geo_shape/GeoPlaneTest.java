package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

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
        GeoShape shape = new GeoRectangle(1, 1);
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
        GeoShape shape = new GeoRectangle(1, 1);
        plane.addShape(shape);
        assertEquals(shape, plane.removeShape(shape));
    }

    /**
     * Validate that the removeShape method null if the shape
     * does not exist.
     */
    @Test
    public void validRemoveNullShape()
    {
        GeoPlane plane = new GeoPlane();
        GeoShape shape = new GeoRectangle(1, 1);
        assertNull(plane.removeShape(shape));
    }

    /**
     * Validate that a List of GeoShapes is returned.
     */
    @Test
    public void validRemoveGeoShapeListReturn()
    {
        GeoPlane plane = new GeoPlane();
        GeoShape shape = new GeoRectangle(1, 1);
        plane.addShape(shape);
        assertTrue(plane.getShapes().contains(shape));
    }

    /**
     * Validate the bitmap.
     */
    @Test
    public void validBitmapReturn()
    {
        GeoPlane plane = new GeoPlane();

        assertEquals(null, plane.getBitmap());
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

    /**
     * Validate that the constructor with a color.
     */
    @Test
    public void validConstructor()
    {
        GeoPlane plane = new GeoPlane(Color.GREEN);
        assertEquals( Color.GREEN, plane.getBackgroundColor() );
    }

}
