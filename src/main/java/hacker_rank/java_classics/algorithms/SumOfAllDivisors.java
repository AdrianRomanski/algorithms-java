package hacker_rank.java_classics.algorithms;

public class SumOfAllDivisors {

    public static void main(String[] args) {

        System.out.println(sumOfDivisors(6));

        Double test = 2.0;


    }

    static int sumOfDivisors(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum+=i;
            }
        }
        return sum;
    }


}
