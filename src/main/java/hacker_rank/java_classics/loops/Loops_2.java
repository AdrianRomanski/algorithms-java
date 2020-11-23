package hacker_rank.java_classics.loops;

import java.util.Scanner;

//We use the integers a, b, and n to create the following series:
// Sample input
// 2
// 0 2 10
// 5 3 5
// Sample output
// 2 6 14 30 62 126 254 510 1022 2046
// 8 14 26 50 98
public class Loops_2 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int result=0;
                    for(int k=0;k<=n - 1;k++){
                        result=(int)Math.pow(2,k)*b + result;
                        System.out.print(a+result+" ");
                    }
        System.out.println();
        }
        in.close();
    }
}

