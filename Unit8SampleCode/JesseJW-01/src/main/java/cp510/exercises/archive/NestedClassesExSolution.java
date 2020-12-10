package cp510.exercises.archive;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NestedClassesExSolution
{
    private static NestedClassesEx1   exer  = new NestedClassesEx1();
    public static void main(String[] args)
    {
        ButtonListener  listener    = new ButtonListener();
        exer.addSandboxListener(listener);
        exer.addShapeListener( listener );
        exer.addExitListener( listener );
    }
    
    private static String getButtonText( ActionEvent evt )
    {
        Object  obj = evt.getSource();
        if ( !(obj instanceof JButton) )
            throw new IllegalArgumentException( "Source not JButton" );
        String  text    = ((JButton)obj).getText();
        return text;
    }
    
    private static class ButtonListener implements ActionListener
    {
        public void actionPerformed( ActionEvent evt )
        {
            String  text    = getButtonText( evt );
            if ( text.startsWith( "Shape" ) )
                exer.changeShapeColor();
            else if ( text.startsWith( "Sand" ) )
                exer.changeSandboxColor();
            else
                System.exit( 0 );
        }
    }
}
