package books.piotr_wroblewski.chapter1;

public class IsPrime {

    public static void main(String[] args) {

        for(int i=2; i<10000; i++)
            if (isPrime(i))
                System.out.println(i + " is a prime number");
    }

    static boolean isPrime(int number) {
        if(number < 2)
            return false;
        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}





