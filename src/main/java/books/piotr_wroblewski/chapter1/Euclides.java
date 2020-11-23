package books.piotr_wroblewski.chapter1;

public class Euclides {

    public static void main(String[] args) {

        System.out.println(euclides(220, 10));
        System.out.println(euclides(350, 15));
        System.out.println(euclides(480, 36));

    }

    static int euclides(int a, int b) {
        if(b == 0)
            return a;
        return euclides(b, a % b);
    }

}

