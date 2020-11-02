package cp510.assignments.assignment3;


/**
 *  This class encapsulates a control register.
 *  It can encode and decode an integer representing the control,
 *  start, count, data, security and origin fields.
 *
 * @author Tim
 */
public class ControlReg {

    private int control;
    private int start;
    private int count;
    private int data;
    private int security;
    private int origin;

    private static int controlMask = 0b1111_0_00_0000_00_000;
    private static int startMask = 0b0000_1_00_0000_00_000;
    private static int countMask = 0b0000_0_11_0000_00_000;
    private static int dataMask = 0b0000_0_00_1111_00_000;
    private static int securityMask = 0b0000_0_00_0000_11_000;
    private static int originMask = 0b0000_0_00_0000_00_111;

    /**
     * Decodes the value sent as input.
     *
     * @param reg the value to decode
     */
    public ControlReg(int reg)
    {
        this.decodeReg(reg);
    }

    /**
     * Gets the control value of the object.
     *
     * @return the control value
     */
    public int getControl()
    {
        return this.control;
    }

    /**
     * Sets the control value of the object.
     *
     * @param control sets the control value
     */
    public void setControl(int control)
    {
        this.control = control;
    }


    /**
     * Gets the start value of the object.
     *
     * @return the start value
     */
    public int getStart()
    {
        return this.start;
    }

    /**
     * Sets the start value of the object.
     *
     * @param start sets the control value
     */
    public void setStart(int start)
    {
        this.start = start;
    }


    /**
     * Gets the count value of the object.
     *
     * @return the count value
     */
    public int getCount()
    {
        return this.count;
    }

    /**
     * Sets the count value of the object.
     *
     * @param count sets the count value
     */
    public void setCount(int count)
    {
        this.count = count;
    }


    /**
     * Gets the data value of the object.
     *
     * @return the data value
     */
    public int getData()
    {
        return this.data;
    }

    /**
     * Sets the data value of the object.
     *
     * @param data sets the control value
     */
    public void setData(int data)
    {
        this.data = data;
    }


    /**
     * Gets the security value of the object.
     *
     * @return the security value
     */
    public int getSecurity()
    {
        return this.security;
    }

    /**
     * Sets the security value of the object.
     *
     * @param security sets the control value
     */
    public void setSecurity(int security)
    {
        this.security = security;
    }


    /**
     * Gets the origin value of the object.
     *
     * @return the origin value
     */
    public int getOrigin()
    {
        return this.origin;
    }

    /**
     * Sets the origin value of the object.
     *
     * @param origin sets the control value
     */
    public void setOrigin(int origin)
    {
        this.origin = origin;
    }

    /**
     * Decodes the fields of the reg value passed to the method.
     *
     * @param reg the value to decode
     */
    public void decodeReg( int reg )
    {
/*
        System.out.println("reg: " + reg);
        System.out.println("control mask: " + controlMask);
        System.out.println("reg+dataMask+shift---"+((reg & dataMask)  >> 9));
        System.out.println("reg+dataMask---"+(reg & dataMask));
*/
        int decodedControl = (reg & controlMask)  >> 12;
        int decodedStart = (reg & startMask)  >> 11;
        int decodedCount = (reg & countMask)  >> 9;
        int decodedData = (reg & dataMask)  >> 5;
        int decodedSecurity = (reg & securityMask)  >> 3;
        int decodedOrigin = (reg & originMask)  >> 0;

        this.setControl(decodedControl);
        this.setStart(decodedStart);
        this.setCount(decodedCount);
        this.setData(decodedData);
        this.setSecurity(decodedSecurity);
        this.setOrigin(decodedOrigin);
/*
        System.out.println("Returned decoded control: " + this.getControl());
        System.out.println("Returned decoded start: " + this.getStart());
        System.out.println("Returned decoded count: " + this.getCount());
        System.out.println("Returned decoded data: " + this.getData());
        System.out.println("Returned decoded security: " + this.getSecurity());
        System.out.println("Returned decoded origin: " + this.getOrigin());
*/

    }

    /**
     * Encodes the decoded fields and returns the final int value.
     *
     * @return the security value
     */
    public int encodeReg()
    {
        int reg = 0;
        reg = reg | getControl() << 12;
        reg = reg | getStart() << 11;
        reg = reg | getCount() << 9;
        reg = reg | getData() << 5;
        reg = reg | getSecurity() << 3;
        reg = reg | getOrigin() << 0;

        return reg;
    }

    /**
     * Overrides the toString method to return a formatted version
     * of the objects decoded values.
     *
     * @return the security value
     */
    public String toString()
    {
        String controlReg = "";

        controlReg = "origin="+getOrigin()
                +",security="+getSecurity()
                +",data="+getData()
                +",count="+getCount()
                +",start="+getStart()
                +",control="+getControl();

        return controlReg;
    }

}
