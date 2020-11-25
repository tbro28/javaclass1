package cp510.assignments.geoshape;

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
     * Validate the draw method is correct.
     */
    @Test
    public void geoLineDraw() {
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
        Graphics2D gtx;
        gtx = new Graphics2D() {
            @Override
            public void draw(Shape s) {

            }

            @Override
            public boolean drawImage(Image img,
                                     AffineTransform xform, ImageObserver obs) {
                return false;
            }

            @Override
            public void drawImage(BufferedImage img,
                                  BufferedImageOp op, int x, int y) {

            }

            @Override
            public void drawRenderedImage(RenderedImage img,
                                          AffineTransform xform) {

            }

            @Override
            public void drawRenderableImage(RenderableImage img,
                                            AffineTransform xform) {

            }

            @Override
            public void drawString(String str, int x, int y) {

            }

            @Override
            public void drawString(String str, float x, float y) {

            }

            @Override
            public void drawString(
                    AttributedCharacterIterator iterator, int x, int y) {

            }

            @Override
            public void drawString(
                    AttributedCharacterIterator iterator, float x, float y) {

            }

            @Override
            public void drawGlyphVector(GlyphVector g, float x, float y) {

            }

            @Override
            public void fill(Shape s) {

            }

            @Override
            public boolean hit(Rectangle rect,
                               Shape s, boolean onStroke) {
                return false;
            }

            @Override
            public GraphicsConfiguration getDeviceConfiguration() {
                return null;
            }

            @Override
            public void setComposite(Composite comp) {

            }

            @Override
            public void setPaint(Paint paint) {

            }

            @Override
            public void setStroke(Stroke s) {

            }

            @Override
            public void setRenderingHint(
                    RenderingHints.Key hintKey, Object hintValue) {

            }

            @Override
            public Object getRenderingHint(
                    RenderingHints.Key hintKey) {
                return null;
            }

            @Override
            public void setRenderingHints(Map<?, ?> hints) {

            }

            @Override
            public void addRenderingHints(Map<?, ?> hints) {

            }

            @Override
            public RenderingHints getRenderingHints() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public void translate(double tx, double ty) {

            }

            @Override
            public void rotate(double theta) {

            }

            @Override
            public void rotate(double theta, double x, double y) {

            }

            @Override
            public void scale(double sx, double sy) {

            }

            @Override
            public void shear(double shx, double shy) {

            }

            @Override
            public void transform(AffineTransform Tx) {

            }

            @Override
            public void setTransform(AffineTransform Tx) {

            }

            @Override
            public AffineTransform getTransform() {
                return null;
            }

            @Override
            public Paint getPaint() {
                return null;
            }

            @Override
            public Composite getComposite() {
                return null;
            }

            @Override
            public void setBackground(Color color) {

            }

            @Override
            public Color getBackground() {
                return null;
            }

            @Override
            public Stroke getStroke() {
                return null;
            }

            @Override
            public void clip(Shape s) {

            }

            @Override
            public FontRenderContext getFontRenderContext() {
                return null;
            }

            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color c) {

            }

            @Override
            public void setPaintMode() {

            }

            @Override
            public void setXORMode(Color c1) {

            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(Font font) {

            }

            @Override
            public FontMetrics getFontMetrics(Font f) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {

            }

            @Override
            public void setClip(int x, int y, int width, int height) {

            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(Shape clip) {

            }

            @Override
            public void copyArea(int x, int y, int width,
                                 int height, int dx, int dy) {

            }

            @Override
            public void drawLine(int x1, int y1, int x2, int y2) {

            }

            @Override
            public void fillRect(int x, int y, int width, int height) {

            }

            @Override
            public void clearRect(int x, int y, int width, int height) {

            }

            @Override
            public void drawRoundRect(int x, int y, int width,
                                      int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void fillRoundRect(int x, int y, int width,
                                      int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void drawOval(int x, int y, int width, int height) {

            }

            @Override
            public void fillOval(int x, int y, int width, int height) {

            }

            @Override
            public void drawArc(int x, int y, int width,
                                int height, int startAngle, int arcAngle) {

            }

            @Override
            public void fillArc(int x, int y, int width,
                                int height, int startAngle, int arcAngle) {

            }

            @Override
            public void drawPolyline(int[] xPoints,
                                     int[] yPoints, int nPoints) {

            }

            @Override
            public void drawPolygon(int[] xPoints,
                                    int[] yPoints, int nPoints) {

            }

            @Override
            public void fillPolygon(int[] xPoints,
                                    int[] yPoints, int nPoints) {

            }

            @Override
            public boolean drawImage(Image img, int x,
                                     int y, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width,
                                     int height, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, Color bgcolor,
                                     ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y,
                                     int width, int height,
                                     Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2,
                                     int dy2, int sx1, int sy1, int sx2,
                                     int sy2, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2,
                                     int dy2, int sx1, int sy1, int sx2,
                                     int sy2, Color bgcolor,
                                     ImageObserver observer) {
                return false;
            }

            @Override
            public void dispose() {

            }
        };

        line.draw(gtx);
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
