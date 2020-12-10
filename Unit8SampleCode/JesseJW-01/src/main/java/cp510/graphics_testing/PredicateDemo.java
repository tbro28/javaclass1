package cp510.graphics_testing;

import java.util.function.Predicate;

import javax.swing.JOptionPane;

public class PredicateDemo
{

    public static void main(String[] args)
    {
        String  prompt  = "Enter a four character string, or cancel";
        String  opInput = getOperatorInput( prompt, new Predicate<String>() {
            public boolean test( String s ) {
                return s == null || s.length() == 4;
            }
        });
        if ( opInput == null )
            System.out.println( "operator canceled" );
        else
            System.out.println( "echo: " + opInput );
    }

    private static String 
    getOperatorInput( String prompt, Predicate<String> pred )
    {
        final String    badInputMsg = "The input was invalid. Please reenter";
        
        String  input   = null;
        boolean valid   = false;
        while ( !valid )
        {
            input = JOptionPane.showInputDialog( null, prompt );
            valid = pred.test( input );
            if ( !valid )
                JOptionPane.showMessageDialog( null, badInputMsg );
        }
        return input;
    }
}
