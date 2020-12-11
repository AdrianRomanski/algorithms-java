package books.piotr_wroblewski.sorting_algorithms;

public class BubbleSortTest {


    public static void main(String[] args) {

        SortingAlgorithms bubble = new SortingAlgorithms(10);

        bubble.add(12);
        bubble.add(1);
        bubble.add(34);
        bubble.add(17);
        bubble.add(88);
        bubble.add(94);
        bubble.add(13);
        bubble.add(77);
        bubble.add(52);
        bubble.add(33);

        bubble.printArray();

        bubble.bubbleSort();

        bubble.printArray();
    }



}
