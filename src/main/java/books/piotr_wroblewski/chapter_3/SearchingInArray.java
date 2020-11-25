package books.piotr_wroblewski.chapter_3;

public class SearchingInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,-7,44,5,1,0,-3};

        searchElement(arr, 0, 44);

    }


    static void searchElement(int[] arr, int left, int number) {
        if(left > arr.length-1)
            System.out.println("There is no number: " + number + " in array");
        else
            if(arr[left] == number)
                System.out.println("We found number: " + number);
            else
                searchElement(arr, left+1, number);
    }


}

