package cp510;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LambdaDemo2 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
      
    public static void main( String[] args )
    {
        LambdaDemo2    demo    = new LambdaDemo2();
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
            
            button.addActionListener(
                e -> { JButton  src = (JButton)e.getSource();
                       if ( src.getText().equals(  "Exit" ) )
                           System.exit( 0 );
                       else
                           System.out.println( "Unrecognized button" );
                     });
            
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
