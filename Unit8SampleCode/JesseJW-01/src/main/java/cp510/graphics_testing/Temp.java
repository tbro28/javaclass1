package cp510.graphics_testing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Temp implements Runnable
{
    public static final String  FRAME_NAME          = "PainterFrame";
    public static final String  CANVAS_NAME         = "Painter";
    public static final String  SANDBOX_BUTTON_NAME = "sandbox";
    public static final String  SHAPE_BUTTON_NAME   = "shape";
    public static final String  EXIT_BUTTON_NAME    = "exit";
    
    private JFrame      frame       = null;
    private Painter     painter     = new Painter();
    private Color       shapeColor  = getRandomColor();
    
    public static void main( String[] args )
    {
        new Temp();
    }
    
    public Temp()
    {
        SwingUtilities.invokeLater( this );
    }

    public void run()
    {
        frame = new JFrame( "Color Changer" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setName( FRAME_NAME );
        frame.setContentPane( new ContentPane() );
        frame.pack();
        frame.setVisible( true );
    }
    
    public void changeSandboxColor()
    {
        painter.setBackground( getRandomColor() );
        painter.repaint();
    }
    
    public void changeShapeColor()
    {
        shapeColor = getRandomColor();
        painter.repaint();
    }
    
    private Color getRandomColor()
    {
        int     rgb     = (int)(Math.random() * 0x1000000);
        Color   color   = new Color( rgb );
        return color;
    }

    @SuppressWarnings("serial")
    private class ContentPane extends JPanel
    {
        public ContentPane()
        {
            super( new BorderLayout() );
            add( painter, BorderLayout.CENTER );
            add( new ButtonPanel(), BorderLayout.SOUTH );
            addKeyListener( new KeyHandler() );
        }
    }
    
    private class KeyHandler implements KeyListener
    {

        @Override
        public void keyTyped(KeyEvent e)
        {
            System.out.println( "key typed" );
        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            System.out.println( "key pressed" );
        }

        @Override
        public void keyReleased(KeyEvent e)
        {
            System.out.println( "key released" );
        }
        
    }
    
    @SuppressWarnings("serial")
    private class ButtonPanel extends JPanel
    {
        public ButtonPanel()
        {
            JButton shapeButton     = new JButton( "Shape Color" );
            JButton sandboxButton   = new JButton( "Sandbox Color" );
            JButton exitButton      = new JButton( "Exit");
            add( sandboxButton );
            add( shapeButton );
            add( exitButton );
            
            sandboxButton.setName( SANDBOX_BUTTON_NAME );
            shapeButton.setName( SHAPE_BUTTON_NAME );
            exitButton.setName( EXIT_BUTTON_NAME );
            
            sandboxButton.addActionListener( e -> changeSandboxColor() );
            shapeButton.addActionListener( e -> changeShapeColor() );
//            exitButton.addActionListener( e -> System.exit( 0 ) );
            exitButton.addActionListener( e -> frame.dispose() );
        }
    }
    
    @SuppressWarnings("serial")
    public class Painter extends JPanel
    {
        public Painter()
        {
            setName( CANVAS_NAME );
            setBackground( new Color( 0xAAAAAA ) );
            setPreferredSize( new Dimension( 300, 300 ) );
        }
        
        @Override
        public void paintComponent( Graphics graphics )
        {
            super.paintComponent( graphics );
            Graphics2D  gtx         = (Graphics2D)graphics;
            Rectangle2D rect        =
                new Rectangle2D.Double( 50, 50, 200, 200 );
            gtx.setColor( shapeColor );
            gtx.fill( rect );
        }
    }
}
