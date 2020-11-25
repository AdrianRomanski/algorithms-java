package books.piotr_wroblewski.chapter_3;

public class FactorialRecursion {

    public static void main(String[] args) {

        for(int i = 0; i<15; i++) {
            System.out.print("Factorial " + i + "=" + factorial(i) + " | ");
        }

        System.out.println();
        for(int i = 0; i<15; i++) {
            System.out.print("Factorial " + i + "=" + factorialWithAddParameter(i, 1) + " | ");
        }
    }

    static long factorial(int x) {
        if(x == 0)
            return 1;
        else
            return x*factorial(x-1);
    }

    static long factorialWithAddParameter(int x, long temp) {
        if(x == 0)
            return temp;
        else
            return factorialWithAddParameter(x-1, x*temp);
    }
}
