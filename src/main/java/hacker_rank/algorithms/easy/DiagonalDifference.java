package hacker_rank.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {

        List<List<Integer>> matrixList = new ArrayList<>();
        matrixList.add(Arrays.asList(11, 2, 4));
        matrixList.add(Arrays.asList(4, 5, 6));
        matrixList.add(Arrays.asList(10, 8, -12));


        int result = diagonalDifference(matrixList);

        System.out.println(result);

    }

    public static int diagonalDifference(List<List<Integer>> matrixList) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int right = matrixList.size()-1;

        for(int i = 0; i < matrixList.size(); i++) {
                leftDiagonalSum+=matrixList.get(i).get(i);
                rightDiagonalSum+=matrixList.get(i).get(right--);
            }
        return Math.abs(leftDiagonalSum-rightDiagonalSum);
        }
}


