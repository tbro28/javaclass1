package cp510.assignments.assignment3;




/***
 This class encapsulates a control register.
 It can encode and decode an integer representing the control,
 start, count, data, security and origin fields.
 It has the following constructor and methods:
 *
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


    public ControlReg(int reg)
    {
        this.decodeReg(reg);
    }



    public int getControl()
    {
        return this.control;
    }
    public void setControl(int control)
    {
        this.control = control;
    }


    public int getStart()
    {
        return this.start;
    }
    public void setStart(int start)
    {
        this.start = start;
    }


    public int getCount()
    {
        return this.count;
    }
    public void setCount(int count)
    {
        this.count = count;
    }


    public int getData()
    {
        return this.data;
    }
    public void setData(int data)
    {
        this.data = data;
    }


    public int getSecurity()
    {
        return this.security;
    }
    public void setSecurity(int security)
    {
        this.security = security;
    }


    public int getOrigin()
    {
        return this.origin;
    }
    public void setOrigin(int origin)
    {
        this.origin = origin;
    }

    //Setters and getters for encapsulated properties.



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
    //Decodes a given register and uses the decoded values to set this object's properties.
/*
        reg
        The given register.
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
    //Encodes the encapsulated properties into an integer value.
/*
        Returns:
        The encoded integer value.
*/

    public String toString()
    {
        String controlReg = "";

        controlReg = "origin="+getOrigin()+",security="+getSecurity()+",data="+getData()+",count="+getCount()+",start="+getStart()+",control="+getControl();

        return controlReg;
    }
    //Formats the values of the encapsulated properties into a human readable string. See above for formatting requirements.
/*
        Returns:
        The formatted string.
*/











}
