package books.piotr_wroblewski.search_algorithms;

public class LinearSearch {

    public static int search(int[] arr, int x) {
        int i;
        for(i = 0; (i<arr.length) && (arr[i]!=x); i++);
            return i;
    }
}
