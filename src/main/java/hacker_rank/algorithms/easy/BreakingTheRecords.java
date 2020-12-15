package hacker_rank.algorithms.easy;

public class BreakingTheRecords {

    public static void main(String[] args) {

        int[] scores = {3,4,21,36,10,28,35,5,24,42};

        int[] ints = breakingRecords(scores);

        for(int i: ints)
            System.out.println(i);

    }

    static int[] breakingRecords(int[] scores) {
        int max = scores[0], min = scores[0];
        int[] scoresCount = new int[2];
        for (int score : scores) {
            if (score > max) {
                scoresCount[0]++;
                max = score;
            }
            if (score < min) {
                scoresCount[1]++;
                min = score;
            }
        }
        return scoresCount;
    }
}
