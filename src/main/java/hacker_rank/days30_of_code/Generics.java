package hacker_rank.days30_of_code;

public class Generics<T> {


    public void printArray (T[] array) {
        for(T t: array) {
            System.out.println(t);
        }
    }
}
