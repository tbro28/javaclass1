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
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class InnerClassDemo2 implements Runnable
{
    private JFrame      frame           = new JFrame( "Inner Class Demo" );
    private Color       orange          = new Color( 0xFF7034 );
    private Color       brown           = new Color( 0x654321 );
    private Color       currColor       = orange;
    private Painter     painter         = new Painter();
    
    public static void main(String[] args)
    {
        InnerClassDemo2 demo    = new InnerClassDemo2();
        SwingUtilities.invokeLater( demo );
    }

    public void run()
    {
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setContentPane( new ContentPane() );
        frame.pack();
        frame.setVisible( true );
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
        implements ActionListener
    {
        private JButton     orangeButton    = new JButton( "Orange" );
        private JButton     brownButton     = new JButton( "Brown" );
        
        public ButtonPanel()
        {
            add( brownButton );
            add( orangeButton );
            brownButton.addActionListener( this );
            orangeButton.addActionListener( this );
        }
        
        public void actionPerformed( ActionEvent evt )
        {
            if ( evt.getSource() == orangeButton )
                currColor = orange;
            else
                currColor = brown;
            painter.repaint();
        }
    }
    
    @SuppressWarnings("serial")
    private class Painter extends JPanel
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
            double      width       = getWidth();
            double      height      = getHeight();
            double      rectWidth   = width / 3;
            double      rectHeight  = height / 3;
            double      rectX       = width / 2 - rectWidth / 2;
            double      rectY       = height / 2 - rectHeight / 2;
            Rectangle2D rect        =
                new Rectangle2D.Double( rectX, rectY, rectWidth, rectHeight );
            gtx.setColor( currColor );
            gtx.fill( rect );
        }
    }
}
