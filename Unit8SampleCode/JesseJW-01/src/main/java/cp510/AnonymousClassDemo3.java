package cp510;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnonymousClassDemo3
{
    public void main( String[] args )
    {
        JButton exit    = new JButton( "Exit" );
        exit.addActionListener( new ActionListener(){
            public void actionPerformed( ActionEvent evt ){
                System.exit( 0 );
            }});
    }
}
