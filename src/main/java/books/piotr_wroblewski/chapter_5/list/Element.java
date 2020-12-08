package books.piotr_wroblewski.chapter_5.list;

public class Element {

    private int value;
    private Element next;

    public Element(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() { return value; }
    public Element getNext() { return next; }
    public void setNext(Element next) { this.next = next; }

    public void showNextElements(String s) {
        Element tmp = this;
        System.out.printf("Next elements: %s", s);
            while(tmp!=null){
                System.out.printf("%d", tmp.value);
            tmp=tmp.next;
            }
        System.out.println();
    }
}
