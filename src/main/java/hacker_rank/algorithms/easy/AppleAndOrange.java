package hacker_rank.algorithms.easy;

public class AppleAndOrange {

    public static void main(String[] args) {


        int[] apples = {2,3,-4};
        int[] oranges = {3,-2,-4};

        countApplesAndOranges(7,10,4,12, apples, oranges);

    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesCount = 0;
        int orangesCount = 0;
        for(int i: apples) {
            if(a + i >= s && a + i <= t)
                applesCount++;
        }
        for(int i: oranges) {
            if(b + i >= s && b + i <= t)
                orangesCount++;
        }
        System.out.println(applesCount);
        System.out.println(orangesCount);
    }

}
