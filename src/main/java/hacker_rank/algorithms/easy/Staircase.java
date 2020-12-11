package hacker_rank.algorithms.easy;

public class Staircase {

    public static void main(String[] args) {

        printStarCase(6);

    }

    static void printStarCase(int n) {
        final String hash = "#";
        final String blank = " ";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if(j > i)
                    sb.append(blank);
                else
                    sb.append(hash);
            }
            if(i < n)
                sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
