package days30_of_code;

// Input 2 Hacker Rank
// Output  Hce akr
//         Rn ak

import java.util.Collections;
import java.util.Scanner;

public class LetsReview {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String numberOfCases = scanner.next();

        int numberOfCasesInt = Integer.parseInt(numberOfCases);

        for(int i = 1; i <= numberOfCasesInt; i++) {
            String string = scanner.next();
            System.out.println(getStringsCombined(string));
        }
        scanner.close();
    }

    private static String getStringsCombined(String string) {
        char[] chars = string.toCharArray();
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if(i > 0) {
                if(i % 2 == 0) {
                    left.append(chars[i]);
                } else {
                    right.append(chars[i]);
                }
            } else {
                left.append(chars[i]);
            }
        }
        return left.toString() + " " + right.toString();
    }
}
