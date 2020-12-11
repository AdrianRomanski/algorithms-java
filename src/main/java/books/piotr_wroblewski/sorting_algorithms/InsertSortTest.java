package books.piotr_wroblewski.sorting_algorithms;

public class InsertSortTest {

    public static void main(String[] args) {

        SortingAlgorithms insertSort = new SortingAlgorithms(10);

        insertSort.add(12);
        insertSort.add(1);
        insertSort.add(34);
        insertSort.add(17);
        insertSort.add(88);
        insertSort.add(94);
        insertSort.add(13);
        insertSort.add(77);
        insertSort.add(52);
        insertSort.add(33);

        insertSort.printArray();

        insertSort.insertSort();

        insertSort.printArray();

    }
}
