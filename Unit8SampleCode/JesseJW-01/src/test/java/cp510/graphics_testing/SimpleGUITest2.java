package cp510.graphics_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;
class SimpleGUITest2
{
    @Test
    void test()
    {
        new SimpleGUI().start();
        JButton okButton = (JButton)Utils.findCompByName( "okButton" );
        assertNotNull( okButton );
        
        JTextField text = (JTextField)Utils.findCompByName( "textBox" );
        assertNotNull( text );
        
        JLabel      label   = (JLabel)Utils.findCompByNameAlt( "label" );
        assertNotNull( label );
        
        String  str = "test string";
        text.setText( str );
        okButton.doClick();
        assertEquals( str, label.getText() );
    }
}
