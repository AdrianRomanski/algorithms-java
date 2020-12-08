package books.piotr_wroblewski.chapter_4;

public class Search {

    public static void main(String[] args) {

    }

    public static int search(int[] tab, int x) {
        int pos=0;
        while((pos < tab.length) && (tab[pos]!= x))
            pos++;
        if(pos < tab.length)
            return pos;
        else
            return -1;
    }

}
