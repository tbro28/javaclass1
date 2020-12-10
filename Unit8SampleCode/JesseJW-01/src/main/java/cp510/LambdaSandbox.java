package cp510;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.util.function.DoubleBinaryOperator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LambdaSandbox implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
    JPanel  panel       = new JPanel();
    Color   currColor   = Color.GRAY;
    Object  obj1;
    
    Runnable        runner1 = () -> {System.out.println( "Tempus fugit" );};
    Runnable        runner2 = () -> System.out.println( "Tempus fugit" );
    ActionListener  listener1 = e -> System.out.println( e.getSource() );
    ActionListener  listener2 = e -> {
        Object obj = e.getSource();
        if ( obj == obj1 )
        {
            currColor = Color.RED;
        }
        else
        {
            currColor = Color.BLUE;
        }
        panel.setBackground( currColor );
    };
    DoubleBinaryOperator    op1 = (a, b) -> a * b;
      
    public static void main( String[] args )
    {
        LambdaSandbox    demo    = new LambdaSandbox();
        SwingUtilities.invokeLater( demo );
    }
    
    public void run()
    {
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setContentPane(  new MainPanel() );
        frame.pack();
        frame.setVisible( true );
    }
    
    @SuppressWarnings( "serial" )
    private class MainPanel extends JPanel
    {
        public MainPanel()
        {
            super( new BorderLayout() );
            
            add( new DrawingSurface(), BorderLayout.CENTER );
            
            JPanel  buttonPanel = new JPanel();
            JButton button  = new JButton( "Exit" );
            
            buttonPanel.add( button );
            add( buttonPanel, BorderLayout.SOUTH );
            
            button.addActionListener( (e) -> {System.exit( 0 );} );
            button.addActionListener( e -> {System.exit( 0 );} );
            button.addActionListener( e -> System.exit( 0 ) );
            
            Color   bgColor = buttonPanel.getBackground();
            bgColor = bgColor.darker();
            buttonPanel.setBackground( bgColor );
        }
    }
   
    @SuppressWarnings( "serial" )
    private class DrawingSurface extends JPanel
    {
        public DrawingSurface()
        {
            Dimension   size    = new Dimension( 300, 300 );
            setPreferredSize( size );
        }
        
        @Override
        public void paintComponent( Graphics graphics )
        {
            Graphics2D  gtx = (Graphics2D)graphics.create();
            
            int xco     = 100;
            int yco     = 100;
            int width   = 150;
            int height  = 150;
            
            gtx.setColor(  Color.RED );
            gtx.fillRect( xco, yco, width, height );
            
            gtx.setStroke(  new BasicStroke( 3.5f ) );
            gtx.setColor(  Color.BLACK );
            gtx.drawRect( xco, yco, width, height );
        }
    }
}
