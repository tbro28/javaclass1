package cp510.exercises.archive;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class NestedClassesEx1 implements Runnable
{
    private JFrame      frame           = new JFrame( "Exercise" );
    private JButton     shapeButton     = new JButton( "Shape Color" );
    private JButton     sandboxButton   = new JButton( "Sandbox Color" );
    private JButton     exitButton      = new JButton( "Exit");
    private Painter     painter         = new Painter();
    private Color       shapeColor      = getRandomColor();
    
    public static void main( String[] args )
    {
        new NestedClassesEx1();
    }
    
    public NestedClassesEx1()
    {
        SwingUtilities.invokeLater( this );
    }

    public void run()
    {
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
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
        System.out.println( shapeColor );
    }
    
    public void addSandboxListener( ActionListener listener )
    {
        sandboxButton.addActionListener( listener );
    }
    
    public void addShapeListener( ActionListener listener )
    {
        shapeButton.addActionListener( listener );
    }
    
    public void addExitListener( ActionListener listener )
    {
        exitButton.addActionListener( listener );
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
        }
    }
    
    @SuppressWarnings("serial")
    private class ButtonPanel extends JPanel
    {
        public ButtonPanel()
        {
            add( sandboxButton );
            add( shapeButton );
            add( exitButton );
        }
    }
    
    @SuppressWarnings("serial")
    public class Painter extends JPanel
    {
        public Painter()
        {
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
