package java_classics.datatypes;

import java.util.Scanner;

//Given an input integer, you must determine which primitive
// data types are capable of properly storing that input.
public class Datatypes {

    public static final String SHORT = "* short";
    public static final String INT = "* int";
    public static final String LONG = "* long";
    public static final String BYTE = "* byte";

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) { System.out.println(BYTE); }
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) { System.out.println(SHORT); }
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) { System.out.println(INT); }
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) { System.out.println(LONG); }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}

