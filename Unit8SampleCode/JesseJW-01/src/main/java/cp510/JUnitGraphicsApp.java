package cp510;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JUnitGraphicsApp implements Runnable
{
    /** The Constant IMAGE_FORMAT. */
    public static final String IMAGE_FORMAT     = "png";
    
    /** The Constant IMAGE_FILE_NAME. */
    public static final String  IMAGE_FILE_NAME = 
        "resources/finalImage." + IMAGE_FORMAT;
    
    private JFrame          frame       = new JFrame( "JUnit Graphics App" );
    private DrawingSurface  surface     = new DrawingSurface();
    private List<ShapeData> allShapes   = new ArrayList<>();
    
    public static void main(String[] args)
    {
        JUnitGraphicsApp    app = new JUnitGraphicsApp();
        SwingUtilities.invokeLater( app );    
        app.execute();
    }
    
    public void execute()
    {
        double      wid     = 75;
        double      hei     = 75;
        double      offset  = 50;
        double      xco     = 10;
        double      yco     = 10;
        Shape       shape   = new Rectangle2D.Double( xco, yco, wid, hei );
        ShapeData   data    =
            new ShapeData( shape, Color.ORANGE, null, 0 );
        allShapes.add( data );
        
        xco += offset;
        yco += offset;
        shape = new Rectangle2D.Double( xco, yco, wid, hei );
        data = new ShapeData( shape, Color.RED, Color.YELLOW, 3 );
        allShapes.add( data );
        
        xco += offset;
        yco += offset;
        shape = new Ellipse2D.Double( xco, yco, wid, hei );
        data = new ShapeData( shape, Color.MAGENTA, Color.BLUE, 3 );
        allShapes.add( data );
        
        xco += offset;
        yco += offset;
        shape = new Ellipse2D.Double( xco, yco, wid, hei );
        data = new ShapeData( shape, new Color( 0xA52A2A ), Color.BLUE, 0 );
        allShapes.add( data );
        
        surface.repaint();
    }

    public void run()
    {
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setContentPane( new MainPanel() );
        frame.pack();
        frame.setVisible( true );
    }

    /**
     * Gets the image currently displayed in the GeoPlane.
     *
     * @return the panel image
     */
    private BufferedImage getPanelImage()
    {
        BufferedImage image = null;
        int width       = surface.getWidth();
        int height      = surface.getHeight();
        int type        = BufferedImage.TYPE_INT_RGB;
        image = new BufferedImage( width, height, type );
        Graphics2D gtx = image.createGraphics();
        surface.paint( gtx );
 
        return image;
    }
    
    private class ShapeData
    {
        private final Shape     shape;
        private final Color     color;
        private final Color     edgeColor;
        private final double    edgeWidth;
        
        public 
        ShapeData( Shape shape, Color color, Color edgeColor, double edgeWidth )
        {
            this.shape = shape;
            this.color = color;
            this.edgeColor = edgeColor;
            this.edgeWidth = edgeWidth;
        }
        
        public void draw( Graphics2D gtx )
        {
            if ( color != null )
            {
                gtx.setColor( color );
                gtx.fill( shape );
            }
            
            if ( edgeColor != null && edgeWidth > 0 )
            {
                gtx.setColor( edgeColor );
                gtx.setStroke(  new BasicStroke( (float)edgeWidth ) );
                gtx.draw(  shape );
            }
        }
    }
    
    @SuppressWarnings("serial")
    public class DrawingSurface extends JPanel
    {
        private final Color bgColor = new Color( .5f, .5f, .5f );
        public DrawingSurface()
        {
            setPreferredSize( new Dimension( 500, 500 ) );
        }
        
        public void paintComponent( Graphics graphics )
        {
            Graphics2D  gtx = (Graphics2D)graphics.create();
            
            gtx.setColor( bgColor );
            gtx.fillRect(  0,  0,  getWidth(), getHeight() );
            
            for ( ShapeData data : allShapes )
                data.draw( gtx );
        }
    }
    
    @SuppressWarnings("serial")
    private class MainPanel extends JPanel
        implements ActionListener
    {
        public MainPanel()
        {
            super( new BorderLayout() );
            
            add( BorderLayout.CENTER, surface );
            JPanel  buttonPanel = new JPanel();
            JButton saveButton  = new JButton( "Save" );
            JButton exitButton  = new JButton( "Exit" );
            
            exitButton.addActionListener( (evt) -> System.exit( 0 ) );
            saveButton.addActionListener( this );
            buttonPanel.add( saveButton );
            buttonPanel.add( exitButton );
            add( BorderLayout.SOUTH, buttonPanel );
        }

        @Override
        public void actionPerformed(ActionEvent arg0)
        {
            try
            {
                BufferedImage   image   = getPanelImage();
                File            outFile = new File( IMAGE_FILE_NAME );
                if ( ImageIO.write( image, IMAGE_FORMAT, outFile ) )
                    System.out.println("image file saved");
                else
                    throw new IOException( "image write failure" );
            }
            catch (IOException exc)
            {
                System.err.println( "Unable to save image file" );
                System.err.println( "\"" + exc.getMessage() + "\"" );
                exc.printStackTrace();
                System.exit(1);
            }
            System.out.println("image saved in " + IMAGE_FILE_NAME);
        }
    }
}
