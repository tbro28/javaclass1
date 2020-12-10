package cp510.graphics_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Component;
import java.util.function.Predicate;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;
class SimpleGUITest
{
    @Test
    void test()
    {
        new SimpleGUI().start();
        JButton okButton    = 
            (JButton)Utils.findComponent( new Predicate<Component>() {
            public boolean test( Component c ) {
                return c instanceof JButton && 
                        ((JButton)c).getText().equalsIgnoreCase( "OK" );
            }
        });
        assertNotNull( okButton );
        
        JTextField  text    = (JTextField)Utils.
            findComponent( c -> c instanceof JTextField );
        assertNotNull( text );
        
        JLabel      label   = (JLabel)Utils.
            findComponent( c -> c instanceof JLabel );
        assertNotNull( label );
        
        String  str = "test string";
        text.setText( str );
        okButton.doClick();
        assertEquals( str, label.getText() );
        
        Utils.pause( 2000 );
        okButton.doClick();
        Utils.pause( 2000 );
    }
}
