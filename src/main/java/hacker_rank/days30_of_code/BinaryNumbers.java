package hacker_rank.days30_of_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Given a base-10 integer, n, convert it to binary (base-2). Then find and print the
// base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            list.add(remainder);
        }
        System.out.println(list.toString());
        scanner.close();
        int max = 1;
        int tempMax = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i).equals(1) && list.get(i + 1).equals(1)) {
                tempMax+=1;
                if(tempMax == max) {
                    max+=1;
                }
            } else {
                tempMax = 0;
            }
        }
        System.out.println(max);
    }
}

