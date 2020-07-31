package days30_of_code;

import java.util.Arrays;
import java.util.Scanner;

//Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
// That one was hard! Damn
public class Arrays2D {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        // Sample input   // Pattern we have to follow
        // 1 1 1 0 0 0    // 1 1 1 | 1 1 0 | 1 0 0 | 0 0 0
        // 0 1 0 0 0 0    //   1   |   0   |   0   |   0
        // 1 1 1 0 0 0    // 1 1 1 | 1 1 0 | 1 0 0 | 0 0 0
        // 0 0 2 4 4 0    // For outer Loop we have to go down by 1 That why we are looping 4 times
        // 0 0 0 2 0 0    // For inner Loop we have to go right by 1 That's why we are looping 4 times
        // 0 0 1 2 4 0    //

        int[] sum = new int[16]; // 16 because we have 4 outer loop and 4 inner = 4 * 4 results = 16
        int hourGlass = 0;
        for (int i = 0; i < 4; i++) { // Looping Rows
            for (int j = 0; j < 4; j++) { // Looping Columns
                int top_row_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];            // [i][j]    [i][j+1]    [i][j+2]
                int middle_row_sum = arr[i+1][j+1];                                 //           [i+1][j+1]
                int bottom_row_sum = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];   // [i+2][j]  [i+2][j+1]  [i+2][j+2]
                sum[hourGlass] = top_row_sum + middle_row_sum + bottom_row_sum;
                hourGlass++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    }
}


