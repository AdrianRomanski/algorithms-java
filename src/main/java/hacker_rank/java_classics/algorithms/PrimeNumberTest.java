package hacker_rank.java_classics.algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumberTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
    }
}
