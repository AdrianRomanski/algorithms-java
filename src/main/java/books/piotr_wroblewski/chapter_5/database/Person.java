package books.piotr_wroblewski.chapter_5.database;

public class Person {

    private String lastName;
    private int income;
    private Person next;

    public Person(String lastName, int income) {
        this.lastName = lastName;
        this.income = income;
        this.next = null;
    }

    public String getLastName() { return lastName; }
    public int getIncome() { return income; }
    public Person getNext() { return next; }
    public void setNext(Person next) { this.next = next; }

    public void printNextPersons(String s) {
        System.out.println(s);
        Person tmp = this;
        while(tmp!=null) {
            System.out.printf(" %12s earns \t%4d\n", tmp.getLastName(), tmp.getIncome());
            tmp.getNext();
        }
        System.out.println();
    }
}
