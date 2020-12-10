package cp510.assignments.geo_shape;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates a set of GeoShape objects displayed on a plane.
 *
 * @author Tim
 */
public class GeoPlane implements GWindowUser {

    /**
     * Holds the background color.
     */
    Color backgroundColor;

    /**
     * Initializes the list to hold the shapes for the program.
     */
    List<GeoShape> geoList = new ArrayList<GeoShape>();

    /**
     * Initializes the GWindow object for displaying shapes.
     */
    GWindow gWindow = new GWindow(500, 500);

    /**
     * Constructor that sets the default background color.
     */
    GeoPlane() {

        gWindow.setGWindowUser(this);
        backgroundColor = new Color( .5f, .5f, .5f);
    }

    /**
     *
     * Constructor that sets the background color.
     *
     * @param color
     */
    public GeoPlane(Color color) {

        gWindow.setGWindowUser(this);
        this.backgroundColor = color;
    }

    /**
     *
     * Adds the shapes to draw.
     *
     * @param gtx
     */
    public void redraw( Graphics2D gtx ) {

        //gtx.fill(shape);
        //gtx.setBackground( Color.CYAN );
        gtx.setColor(Color.DARK_GRAY);
        gtx.setColor( backgroundColor );
        gtx.fillRect(0,0, gWindow.getWidth(), gWindow.getHeight());

        /*
        int width   = 70;
        int height  = 35;
        gtx.setColor( Color.ORANGE );
        gtx.fillRect( gWindow.getWidth()/2, gWindow.getHeight()/2, width, height );
        */

        //this.show();


        for (GeoShape shape : geoList) {
            shape.draw(gtx);  //currently prints the console output.
            //gtx.draw(shape);
        }
    }

    /**
     * Explicitly draws the shapes in the list of shapes.
     */
    public void redraw() {
        gWindow.repaint();
    }

    /**
     * Causes the plane to become visible.
     * Any shapes stored in the list of shapes to draw
     * will immediately be drawn.
     */
    public void show() {

        gWindow.start();
        gWindow.repaint();

    }

    public BufferedImage getBitmap() {

        //Not sure either!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        return new BufferedImage(1,1,1);
        //GWindow.class.get

        return null;

    }

    /**
     * Add a shape to the list of shapes to be drawn on the plane.
     *
     * @param shape
     */
    public void addShape( GeoShape shape ) {
        geoList.add(shape);
    }

    /**
     *
     * Removes the given shape from the list of shapes to draw on the plane.
     *
     * @param shape
     * @return shape
     */
    public GeoShape removeShape( GeoShape shape ) {

        GeoShape shapeToRemove;

        if(geoList.remove(shape))
            shapeToRemove = shape;
        else
            shapeToRemove = null;

        return shapeToRemove;
    }

    /**
     *
     * Returns a List object of all the current shapes.
     *
     * @return geoList
     */
    public List<GeoShape> getShapes() {
        return geoList;
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