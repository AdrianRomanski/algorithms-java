package books.piotr_wroblewski.search_algorithms;

public class BinarySearch {

    static int search(int[] arr, int x) {
        int left = 0, right = arr.length - 1, mid = 0;
        boolean founded = false;

        while((left <= right) && (!founded)) {
            mid = (left + right) / 2;
            if (arr[mid] == x)
                founded = true;
            else if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
            if (founded)
                return mid;
            else
                return -1;
        }
        return -1;
    }
}
