package cp510;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NestedClassDemo3 implements Runnable
{
    public static final String  COLOR       = "Color";
    public static final String  APPLAUD     = "Applaud";
    public static final String  DERIDE      = "Deride";
    public static final String  EXIT        = "Exit";
    
    private final JFrame        frame;
    private final ButtonPanel   buttonPanel;
    private final JPanel        sandbox;
    private final JButton       colorButton;
    private final JButton       applaudButton;
    private final JButton       derideButton;
    private final JButton       exitButton;
    
    private Rectangle2D         shape           = null;
    private Color               shapeColor      = new Color( .5f, .5f, .5f );
    private Color               sandboxColor    = new Color( .99f, .99f, .99f );
    
    public static void main( String[] args )
    {
        NestedClassDemo3  sample  = new NestedClassDemo3();
        Thread              thread  = new Thread( sample, "GUI thread" );
        thread.start();
        
        Rectangle2D rect    =
            new Rectangle2D.Double( 0, 0, 200, 100 );
        sample.setShape( rect );
        sample.redraw();
        
        int xStep   = -1;
        int yStep   = -1;
        for ( ; ; )
        {
            Rectangle2D shape       = sample.getShape();
            double      xco         = shape.getX();
            double      yco         = shape.getY();
            double      width       = shape.getWidth();
            double      height      = shape.getHeight();
            double      widthBound  = sample.getSandboxWidth() - width;
            double      heightBound = sample.getSandboxHeight() - height;
            
            xco += xStep;
            if ( xco < 0 )
            {
                xco = 0;
                xStep = 1;
            }
            if ( xco > widthBound )
            {
                xco = widthBound;
                xStep = -1;
            }
            
            yco += yStep;
            if ( yco < 0 )
            {
                yco = 0;
                yStep = 1;
            }
            if ( yco > heightBound )
            {
                yco = heightBound;
                yStep = -1;
            }
            
            shape.setRect( xco, yco, width, height );
            sample.redraw();
            pause( 4 );
        }
    }
    
    public void run()
    {
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setContentPane( buttonPanel );
        frame.pack();
        frame.setVisible( true );
    }
    
    public NestedClassDemo3()
    {
        frame = new JFrame( "Nested Class Sample 1" );
        colorButton = new JButton( COLOR );
        applaudButton = new JButton( APPLAUD );
        derideButton = new JButton( DERIDE );
        exitButton = new JButton( EXIT );
        buttonPanel = new ButtonPanel();
        sandbox = buttonPanel.getSandbox();
    }
    
    public double getSandboxWidth()
    {
        double  width   = sandbox.getWidth();
        return width;
    }
    
    public double getSandboxHeight()
    {
        return sandbox.getHeight();
    }
    
    public Rectangle2D getShape()
    {
        return shape;
    }
    
    public void setShape( Rectangle2D shape )
    {
        this.shape = shape;
    }
    
    public void setShapeColor( Color color )
    {
        if ( color == null )
            throw new IllegalArgumentException( "color may not be null" );
        shapeColor = color;
    }
    
    public void setSandboxColor( Color color )
    {
        if ( color == null )
            throw new IllegalArgumentException( "color may not be null" );
        sandboxColor = color;
    }
    
    public void redraw()
    {
        sandbox.repaint();
    }
    
    private static void pause( long millis )
    {
        try
        {
            Thread.sleep( millis );
        }
        catch ( InterruptedException exc )
        {
        }
    }
    
    @SuppressWarnings("serial")
    private class SandboxPanel extends JPanel
    {
        public SandboxPanel( Dimension dim )
        {
            setPreferredSize( dim );
        }
        
        @Override
        public void paintComponent( Graphics graphics )
        {
            super.paintComponent( graphics );
            Graphics2D  gtx = (Graphics2D)graphics;
            
            gtx.setColor( sandboxColor );
            gtx.clearRect( getX(), getY(), getWidth(), getHeight() );
            if ( shape != null )
            {
                gtx.setColor( shapeColor );
                gtx.fill( shape );
            }
        }
    }
    
    @SuppressWarnings("serial")
    private class ButtonPanel extends JPanel
    {
        private final SandboxPanel  playground;
        
        private ButtonPanel()
        {
            super( new BorderLayout() );
            playground = new SandboxPanel( new Dimension( 900, 500 ) );
            playground.setBackground( sandboxColor );
            add( playground, BorderLayout.CENTER );
            
            JPanel      lowerPane   = new JPanel();
            add( lowerPane, BorderLayout.SOUTH );
            ButtonMgr   listener    = new ButtonMgr();
            JButton[]   buttons     = 
                new JButton[] { colorButton, applaudButton, derideButton, exitButton };
            for ( JButton button : buttons )
            {
                button.addActionListener( listener );
                lowerPane.add( button );
            }
        }
        
        public JPanel getSandbox()
        {
            return playground;
        }
    }
    
    private class ButtonMgr implements ActionListener
    {
        public void actionPerformed( ActionEvent evt )
        {
            Object  src = evt.getSource();
            if ( src == colorButton )
                setColor();
            else if ( src == applaudButton )
                showMessage( "Yes!" );
            else if ( src == derideButton )
                showMessage( "Boooooo!" );
            else if ( src == exitButton )
                System.exit( 0 );
            else
                showMessage( "spurious interrupt" );
        }
        
        private void showMessage( String msg )
        {
            JOptionPane.showMessageDialog( null, msg );
        }
        
        private void setColor()
        {
            float   red     = (float)Math.random();
            float   green   = (float)Math.random();
            float   blue    = (float)Math.random();
            Color   color   = new Color( red, green, blue );
            setShapeColor( color );
            redraw();
        }
    }
}
