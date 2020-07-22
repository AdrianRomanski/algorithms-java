package java_classics.conversions;

import java.util.Scanner;

//You are given an integer , you have to convert it into a string.
// converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer"
public class IntToString {

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}


