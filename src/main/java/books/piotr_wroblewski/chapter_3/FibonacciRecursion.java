package books.piotr_wroblewski.chapter_3;

public class FibonacciRecursion {

    public static void main(String[] args) {

        for(int i = 1; i < 15; i ++) {
            System.out.println("fib[" + i + "]" + fib(i));
        }

    }

    //end with stackoverflow+
    static long fib(int x) {
        if(x > 2)
            return x;
        else
            return fib(x-1) + fib(x - 2);
    }
}
