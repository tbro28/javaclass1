package cp510.assignments.assignment2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Numbers {

    public static boolean isPrime( int num )
    {
        boolean prime = true;

        if(num == 0 || num == 1)
            prime = false;
        else {
            for(int i = 2; i < num; i++) {
                if(num%i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        return prime;
    }

    public static int lcm( int param1, int param2 )
    {
        int highLCM = param1 * param2;
        int lcm = -1;
        boolean found = false;

        ArrayList<Integer> param1List = new ArrayList<Integer>();
        ArrayList<Integer> param2List = new ArrayList<Integer>();

        if(param1 == 0 || param2 == 0)
            lcm = 0;
        else {


            for (int i = param1; i <= highLCM; i = i + param1) {
                param1List.add(i);
            }

            for (int i = param2; i <= highLCM; i = i + param2) {
                param2List.add(i);
            }

            //System.out.println(param1List);
            //System.out.println(param2List);

            for (Integer param1Item : param1List) {
                for (Integer param2Item : param2List) {
                    //System.out.println(param1Item +" == "+ param2Item);
                    if (param1Item.equals(param2Item)) {
                        //System.out.println("FOUND~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        lcm = param1Item;
                        found = true;
                        break;
                    }
                }
                if(found)
                    break;
            }
        }
        //System.out.println("Answer: " + lcm);
        return lcm;
    }

    public static int gcf( int param1, int param2 )
    {

        boolean found = false;
        int gcf = -1;

        //System.out.println(param1);
        //System.out.println(param2);


        ArrayList<Integer> param1List = new ArrayList<Integer>();
        ArrayList<Integer> param2List = new ArrayList<Integer>();

        if(param1 == 0 || param2 == 0)
            gcf = 0;
        else {

            for (int i = 1; i <= param1; i++) {
                if (param1 % i == 0) {
                    param1List.add(i);
                }
            }

            for (int i = 1; i <= param2; i++) {
                if (param2 % i == 0) {
                    param2List.add(i);
                }
            }

            Collections.reverse(param1List);
            Collections.reverse(param2List);


            //System.out.println(param2List);
            //System.out.println(param1List);


            for (Integer param1Item : param1List) {
                for (Integer param2Item : param2List) {
                    //System.out.println(param1Item +" == "+ param2Item);
                    if (param1Item.equals(param2Item)) {
                        //System.out.println("FOUND~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        gcf = param1Item;
                        found = true;
                        break;
                    }
                }
                if (found)
                    break;
            }
        }

    //System.out.println("Answer: " + lcm);
        return gcf;
    }

    public static double mean( double[] arr )
    {
        double sum = 0;
        double mean = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        mean = sum / arr.length;

        return mean;
    }

    public static double median( double[] arr )
    {

        ArrayList<Double> medianList = new ArrayList<Double>();
        int medianListLength = arr.length;
        double median = 0.0;

        for(int i = 0; i < medianListLength; i++) {
            medianList.add(arr[i]);
        }

        Collections.sort(medianList);

        System.out.println("\n"+medianList);

        int medianNumber = 0;
        int medianNumberTwo = 0;


        if(medianListLength % 2 != 0) {
            System.out.println("Length is odd.");
            medianNumber = medianListLength/2;
            System.out.println("Int median number: " + medianNumber);
            median = medianList.get(medianNumber);
        }
        else {
            medianNumber = (medianListLength/2)-1;
            medianNumberTwo = medianNumber+1;
            System.out.println("Int median number: " + medianNumber);
            System.out.println("Int median number 2: " + medianNumberTwo);
            median = (medianList.get(medianNumber) + medianList.get(medianNumberTwo)) / 2;
        }

        System.out.println("Answer: " + median);

        return median;
    }

    public static long factorial( long num )
    {
        //long i = 1;
        int numInt = (int)num;
        long factorial = 1;

        for(int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static BigInteger factorial( BigInteger num )
    {
        int factorialInt = num.intValue();
        BigInteger factorial = new BigInteger("1");
        BigInteger factorialSubCount = new BigInteger("1");

        for(int i = 1; i <= factorialInt; i++) {
            //factorial.add(factorial.multiply((BigInteger.valueOf((long)i))));
            factorial = factorial.multiply((BigInteger.valueOf((long)i)));

            //System.out.println(BigInteger.valueOf((long)i));
            //System.out.println(factorial);
        }

        return factorial;
    }





}
