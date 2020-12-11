package hacker_rank.algorithms.easy;

public class MiniMaxSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        minMaxSum(arr);

        int[] arr2 = {5,5,5,5,5};

        minMaxSum(arr2);

        int[] arr3 = {793810624, 895642170, 685903712, 623789054, 468592370};

        minMaxSum(arr3 );

        int[] arr4 = {140537896, 243908675, 670291834, 923018467, 520718469};

        minMaxSum(arr4);

    }


    public static void minMaxSum(int[] arr) {
        long maxSum = 0;
        long minSum = Long.MAX_VALUE;
        long tempSum = 0;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i)
                    tempSum+=arr[j];
            }
            if (tempSum > maxSum)
                maxSum = tempSum;
            if (tempSum < minSum)
                minSum = tempSum;
            tempSum = 0;
        }
        if(minSum == 0)
            minSum = maxSum;
        System.out.println(minSum + " " + maxSum);
    }
}
