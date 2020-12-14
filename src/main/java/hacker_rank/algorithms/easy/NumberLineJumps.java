package hacker_rank.algorithms.easy;

public class NumberLineJumps {

    public static void main(String[] args) {

    }


    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        for(int i = 0; i < 10000; i++) {
            if(x1 == x2) {
                result = "YES";
                break;
            }
            x1+=v1;
            x2+=v2;
        }
        return result;
    }

}
