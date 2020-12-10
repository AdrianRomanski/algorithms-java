package books.piotr_wroblewski.chapter_5.database;

public class CardIndex {

    Person head;
    Person tail;

    public Person addEnd(String name, int income) {
        Person newPerson = new Person(name,income);
        if(head==null) {
            head=newPerson;
            tail=newPerson;
        } else {
            tail.setNext(newPerson);
            newPerson.setNext(null);
            tail = newPerson;
        }
        return newPerson;
    }

    public void print(String s) {
        if(head!=null) {
            head.printNextPersons(s);
        } else {
            System.out.println("Card Index is empty");
        }
    }

    public CardIndex deletePerson(String lastName) {
        Person tmp = head, previous=null;
        boolean res = false;
        while(tmp != null) {
            if(tmp.getLastName().equals(lastName)) {
                res=true;
                break;
            } else {
                previous=tmp;
                tmp=previous.getNext();
            }
        }
        if(res == false) {
            System.out.println("Person " + lastName + "  not found");
            return this;
        }
        if((previous == null) && (tmp.getNext()==null)) {
            head=null;
            tail=null;
            return this;
        }
        if((previous==null) && (tmp.getNext()!=null)) {
            head=tmp.getNext();
            return this;
        }
        if((previous!=null) &&(tmp.getNext()==null)) {
             previous.setNext(null);
             tail=previous;
             return this;
        }
        previous.setNext(tmp.getNext());
        return this;
    }
}
