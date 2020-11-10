package cp510.assignments.geo_shape;

import java.awt.Color;

/**
 * Encapsulates a set of GeoShape objects displayed on a plane.
 *
 * @author Tim
 */
public class GeoPlane {

    /**
     * Sets the background color.
     */
    Color backgroundColor;

    /**
     * Constructor that sets the default color.
     */
    GeoPlane() {
        backgroundColor = new Color( .5f, .5f, .5f);
    }

    /**
     * Causes the plane to become visible.
     * Any shapes stored in the list of shapes to draw
     * will immediately be drawn.
     */
    public void show() {

    }

    /**
     * Add a shape to the list of shapes to be drawn on the plane.
     *
     * @param shape
     */
    public void addShape( GeoShape shape ) {

    }

    /**
     *
     * Removes the given shape from the list of shapes to draw on the plane.
     *
     * @param shape
     * @return shape
     */
    public GeoShape removeShape( GeoShape shape ) {

        return shape;
    }

    /**
     * Explicitly draws the shapes in the list of shapes.
      */
    public void redraw() {

    }

    /**
     *
     * Gets the background color.
     *
     * @return backgroundColor
     */
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     *
     * Sets the background color.
     *
     * @param backgroundColor
     */
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

}
