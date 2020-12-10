package cp510.graphics_testing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class SimpleGUI implements Runnable
{
    public static void main( String[] args )
    {
        new SimpleGUI().start();
    }
    
    public void start()
    {
        try
        {
            SwingUtilities.invokeAndWait( this );
        }
        catch ( InvocationTargetException exc )
        {
            exc.printStackTrace();
            System.exit( 1 );
        }
        catch ( InterruptedException exc )
        {
            // don't care
        }
    }
    
    @Override
    public void run()
    {
        JFrame      frame           = new JFrame( "PasswordGUI" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        JPanel      panel           = new JPanel( new BorderLayout() );
        JTextField  textBox         = new JTextField( 15 );
        JLabel      label           = new JLabel( "Default Label" );
        JPanel      textPanel       = 
            new JPanel( new GridLayout( 2, 1, 5, 5) );
        JButton     okButton        = new JButton( "OK" );
        JButton     cancelButton    = new JButton( "Cancel" );
        JPanel      buttonPanel     = 
            new JPanel( new GridLayout( 2, 1, 5, 5) );
        
        textPanel.add( label );
        textPanel.add( textBox );
        panel.add( textPanel, BorderLayout.CENTER );
        
        buttonPanel.add( okButton );
        buttonPanel.add( cancelButton );
        panel.add( buttonPanel, BorderLayout.SOUTH );
        
        frame.setContentPane( panel );
        okButton.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent e ){
                label.setText( textBox.getText() );
            }
        });
        cancelButton.addActionListener( e -> System.exit( 0 ) );
        panel.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        textPanel.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        buttonPanel.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        
        frame.pack();
        frame.setVisible( true );
        
        textBox.setName( "textBox" );
        label.setName( "label" );
        okButton.setName( "okButton" );
        cancelButton.setName( "cancelButton" );
    }
}
