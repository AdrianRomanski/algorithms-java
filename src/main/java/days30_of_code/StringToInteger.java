package days30_of_code;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            Integer i = Integer.valueOf(S);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Wrong type provided");
        }
    }
}
