package books.piotr_wroblewski.chapter_5.list;

public class List {

    private Element head;
    private Element tail;

    public enum Status{
        SEARCH, END
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public Element getHead() { return head; }
    public Element getTail() { return tail; }

    public Element add(int x) {
        Element newElement = new Element(x);
        if(this.isEmpty()){
            head=newElement;
        } else {
            tail.setNext(newElement);
            newElement.setNext(null);
        }
        tail=newElement;
        return newElement;
    }

    public Element addSorted(int x) {
        Element newElement = new Element(x);

        if(head == null) {
            head=newElement;
            tail=newElement;
            newElement.setNext(null);
            return newElement;
        }
        Status state = Status.SEARCH;
        Element before=null, after=this.head;

        while((state==Status.SEARCH) && (after!=null)) {
            if(after.getValue() >= x)
                state=Status.END;
            else {
                before=after;
                after=after.getNext();
            }
        }
        if(before==null) {
            head=newElement;
            newElement.setNext(after);
        } else {
            if(after==null) {
                tail.setNext(newElement);
                newElement.setNext(null);
                tail=newElement;
            } else {
                before.setNext(newElement);
                newElement.setNext(after);
            }
        }
        return newElement;
    }

    public boolean search(int x) {
        Element tmp = head;
        boolean res=false;
        while(tmp != null) {
            if(tmp.getValue() == x) {
                res=true;
                break;
            } else {
                tmp=tmp.getNext();
            }
        }
        return res;
    }

    public void showAll(String s) {
        if(head!=null) {
            head.showNextElements(s);
        } else{
            System.out.println("List is empty");
        }
    }

    public List deleteFirst() {
        if(!this.isEmpty())
            head=head.getNext();
        return this;
    }

    public List deleteLast() {
        if(head==tail) {
            head=null;
            tail=null;
        } else {
            Element temp=head;
            while((temp.getNext()) != tail)
                temp=temp.getNext();
            this.tail = temp.getNext();
            temp.setNext(null);
        }
        return this;
    }

    public List deleteSelected(int x ) {
        Element tmp = head, before=null;
        boolean res = false;
        while(tmp!=null) {
            if(tmp.getValue() == x) {
                res=true;
                break;
            } else {
                before = tmp;
                tmp = tmp.getNext();
            }
        }
        if(!res) return this;

        if((before==null) && (tmp.getNext()==null)) {
            head=null;
            tail=null;
            return this;
        }
        if((before==null) && (tmp.getNext()!=null)) {
            head=tmp.getNext();
            return this;
        }
        if((before!=null) && (tmp.getNext()==null)) {
            before.setNext(null);
            tail = before;
            return this;
        }
        before.setNext(tmp.getNext());
        return this;
    }

    public List sum(List x, List y) {
        List sum = new List();
        Element q1=x.head, q2=y.head;
        while(q1!=null) {
            sum.addSorted(q1.getValue());
            q1=q1.getNext();
        }
        while(q2!=null) {
            sum.addSorted(q2.getValue());
            q2=q2.getNext();
        }
        return sum;
    }


}
