package books.piotr_wroblewski.chapter_3;

public class Exercises {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};

        int[] reverseArr = reverseArr(array, 0, array.length-1);

        for(int i: reverseArr)
            System.out.print(i + ", ");


        System.out.println();

        intToBinary(2);

        System.out.println();

        System.out.println(euclides(24,30));
        System.out.println(euclides2(66,10));

    }


    static int[] reverseArr(int[] arr, int left, int right) {
        if(left >= arr.length/2)
            return arr;
        else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            return reverseArr(arr, left+1, right-1);
        }
    }

    static int binarySearch(int[] arr, int x, int left, int right) {
        if(left > right)
            return -1;
        else {
            int mid = (left+right) / 2;
            if(arr[mid] == x)
                return mid; // we found the element
            else
                if(x<arr[mid])
                    return binarySearch(arr, x, left, mid-1);
            else
                return binarySearch(arr, x, mid+1, right);
        }
    }


    static void intToBinary(int n) {
        if(n!=0) {
            intToBinary(n/2);
            System.out.print(n % 2);
        } else
            System.out.print(0);
    }

    static int euclides(int a, int b) {
        if(b > a)
            return euclides(a, b-a);
        if(b < a)
            return euclides(a-b, b);
        else
            return b;
    }

    static int euclides2(int a, int b) {
        if(b == 0)
            return a;
        else
            return euclides2(b, a % b);
    }
 }
