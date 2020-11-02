package cp510.assignments.assignment3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 *  Tests for the ControlReg class.
 *
 * @author Tim
 */
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
    }


    /**
     * Verify that the control value is decoded
     * correctly using the decodeReg method directly.
     */
    @Test
    public void decodeValidControlValueDecoded()
    {
        int reg1    = 0b0000_0_00_0000_00_000;
        ControlReg  control1    = new ControlReg( reg1 );
        reg1    = 0b0110_1_01_1000_11_001;
        control1.decodeReg(reg1);

        assertTrue(6 == control1.getControl());
    }


    /**
     * Verify that the start value is decoded correctly.
     */
    @Test
    public void decodeValidStartValue()
    {
        int reg1    = 0b0110_1_01_1000_11_001;
        ControlReg  control1    = new ControlReg( reg1 );

        assertTrue(1 == control1.getStart());
    }


    /**
     * Verify that the count value is decoded correctly.
     */
    @Test
    public void decodeValidCountValue()
    {
        int reg1    = 0b0110_1_01_1000_11_001;
        ControlReg  control1    = new ControlReg( reg1 );

        assertTrue(1 == control1.getCount());
    }


    /**
     * Verify that the data value is decoded correctly.
     */
    @Test
    public void decodeValidDataValue()
    {
        int reg1    = 0b0110_1_01_1000_11_001;
        ControlReg  control1    = new ControlReg( reg1 );

        assertTrue(8 == control1.getData());
    }


    /**
     * Verify that the security value is decoded correctly.
     */
    @Test
    public void decodeValidSecurityValue()
    {
        int reg1    = 0b0110_1_01_1000_11_001;
        ControlReg  control1    = new ControlReg( reg1 );

        assertTrue(3 == control1.getSecurity());

    }


    /**
     * Verify that the origin value is decoded correctly.
     */
    @Test
    public void decodeValidOriginValue()
    {
        int reg1    = 0b0110_1_01_1000_11_001;
        ControlReg  control1    = new ControlReg( reg1 );

        assertTrue(1 == control1.getOrigin());

    }


    /**
     * Verify toString override expected return.
     */
    @Test
    public void stringValidReturnValue()
    {
        int reg1    = 0b0110_1_01_1000_11_001;
        ControlReg  control1    = new ControlReg( reg1 );

        assertEquals("origin=1,security=3,data=8," +
                "count=1,start=1,control=6", control1.toString());
    }
}
