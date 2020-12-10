package cp510.graphics_testing;

import java.awt.Component;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class UtilsTest
{
    @AfterEach
    void tearDown()
    {
        Frame[] frames  = Frame.getFrames();
        for ( Frame frame : frames )
            frame.dispose();
    }
    
    @Test
    void testFindComponent()
    {
        String[]    names   = new String[50];
        for ( int inx = 0 ; inx < names.length ; ++inx )
            names[inx] = String.format( "name%03d", inx );
        JFrame  frame   = new JFrame();
        JPanel  content = new JPanel();
        frame.setContentPane( content );
        frame.setName( names[0] );
        content.setName( names[1] );
        
        int         numComponents   = 2;
        int         nextName        = numComponents;
        JPanel      currParent      = content;
        for ( int inx = 0 ; inx < 5 ; ++inx )
        {
            JPanel  panel       = new JPanel();
            JButton button1     = new JButton();
            JButton button2     = new JButton();
            panel.setName( names[nextName++] );
            button1.setName( names[nextName++] );
            button2.setName( names[nextName++] );
            
            currParent.add( panel );
            panel.add( button1 );
            panel.add( button2 );
            currParent = panel;
            numComponents += 3;
            frame.setVisible( true );
        }
    
        for ( int inx = 0 ; inx < numComponents ; ++inx )
        {
            String      name    = names[inx];
            Component   comp    = 
                Utils.findComponent( c -> name.equals( c.getName() ) );
//            Utils.findComponent( c -> c.getName().equals( name ) );
            String    cName  = null;
            if ( comp != null )
                cName = comp.getName();
            System.out.println( cName );
        }
    }
}
