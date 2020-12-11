package books.piotr_wroblewski.sorting_algorithms;

public class SortingAlgorithms {

    private int[] arr;
    private static int size;
    private int counter;

    public SortingAlgorithms(int max) {
        arr = new int[max];
        counter = 0;
        size = max;
    }


    public void insertSort() {
        for(int i=1; i<size; i++) {
            int j = i;
            int temp = arr[j];
            while ((j > 0) && (arr[j-1] > temp)) {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }

    public void bubbleSort() {
        for(int i = 1; i<size; i++) {
            for(int j = size-1; j>=i; j--){
                if(arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }

    public void shakerSort() {
        int left = 1, right = size-1, k=size-1;
        int temp;
        do {
            for (int j = right; j >= left; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    k = j;
                }
                left = k + 1;
            }
            for (int j = left; j <= right; j++) {
                if (arr[j - 1] >= arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    k = j;
                }
            }
            right = k - 1;
        }
        while (left<=right);
    }

    public void quickSort(){
            }


    public void printArray() {
        System.out.print("[ ");
        for(int i = 0; i < counter; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }


    public void add(int x) {
        if(counter < size) {
            arr[counter] = x;
            counter++;
        } else {
            System.out.println("Array is full");
        }
    }
}
