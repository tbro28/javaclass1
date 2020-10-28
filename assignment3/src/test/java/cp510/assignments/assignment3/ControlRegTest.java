package cp510.assignments.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControlRegTest {



    /**
     * Verify that 0b0110_1_01_1000_11_001 encodes to 27417.
     */
    @Test
    public void encodeValidValue()
    {
        int reg1 = 27417;
        ControlReg  control1    = new ControlReg( 0b0110_1_01_1000_11_001 );
        assertTrue(reg1 == control1.encodeReg());
        System.out.println(reg1);
    }


    /**
     * Verify that the control value is decoded correctly.
     */
    @Test
    public void decodeValidControlValue()
    {
        int reg1    = 0b0110_1_01_1000_11_001;
        ControlReg  control1    = new ControlReg( reg1 );

        assertTrue(6 == control1.getControl());
        System.out.println(reg1);
        System.out.println(control1.getControl());
    }




    /**
     * Verify toString override expected return.
     */
    @Test
    public void stringValidReturnValue()
    {
        int reg1    = 0b0110_1_01_1000_11_001;
        ControlReg  control1    = new ControlReg( reg1 );

        assertEquals("origin=1,security=3,data=8,count=1,start=1,control=6", control1.toString());
        System.out.println(reg1);
        System.out.println(control1.getControl());
    }



}
