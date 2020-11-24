

public enum Elements {
    H,
    HE,
    LI,
    BE,
    B,
    C,
    N,
    O,
    F,
    NE;

    public static String getSymbol (Elements element ) {

        String sym = element.toString();

        if(sym.length() > 1) {
            char[] name = new char[2];

            name[0] = sy
        }

    }


}

public class Elements {


    /*
1		1.008	Hydrogen	H	-259	-253	0.09	0.14	1776	1	1s1	13.60
2		4.003	Helium	He	-272	-269	0.18		1895	18	1s2	24.59
3		6.941	Lithium	Li	180	1,347	0.53		1817	1	[He] 2s1	5.39
4		9.012	Beryllium	Be	1,278	2,970	1.85		1797	2	[He] 2s2	9.32
5		10.811	Boron	B	2,300	2,550	2.34		1808	13	[He] 2s2 2p1	8.30
6		12.011	Carbon	C	3,500	4,827	2.26	0.09	ancient	14	[He] 2s2 2p2	11.26
7		14.007	Nitrogen	N	-210	-196	1.25		1772	15	[He] 2s2 2p3	14.53
8		15.999	Oxygen	O	-218	-183	1.43	46.71	1774	16	[He] 2s2 2p4	13.62
9		18.998	Fluorine	F	-220	-188	1.70	0.03	1886	17	[He] 2s2 2p5	17.42
10		20.180	Neon	Ne	-249	-246	0.90		1898	18	[He] 2s2 2p6	21.56
     */



    private final int rating;
    private Apple2( int rating )
    {
        this.rating = rating;
    }

    public String getRating()
    {
        return rating + " stars";
    }


}
