package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit tests for the GeoRectangle class.
 *
 * @author Tim
 */
public class GeoRectagleTest {

    @Test
    public void rectangleWidth() {
        GeoRectangle rectangle = new GeoRectangle();
        rectangle.setWidth(5.5);
        assertEquals(5.5, rectangle.getWidth());
    }

    @Test
    public void rectangleHeight() {
        GeoRectangle rectangle = new GeoRectangle();
        rectangle.setHeight(5.5);
        assertEquals(5.5, rectangle.getHeight());
    }

    @Test
    public void rectangleArea() {
        GeoRectangle rectangle = new GeoRectangle();
        rectangle.setWidth(5.5);
        rectangle.setHeight(5.5);
        assertEquals(30.25, rectangle.area());
    }

    @Test
    public void rectanglePerimeter() {
        GeoRectangle rectangle = new GeoRectangle();
        rectangle.setWidth(5.5);
        rectangle.setHeight(5.5);
        assertEquals(22, rectangle.perimeter());
    }

    @Test
    public void rectangleString() {
        GeoRectangle rectangle = new GeoRectangle();
        rectangle.setWidth(555.55555);
        rectangle.setHeight(333.33333);
        assertEquals("origin=(0.0000,0.0000),color=null,width=555.5556,height=333.3333", rectangle.toString());
    }

}
