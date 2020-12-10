package books.piotr_wroblewski.chapter_5.database;

class LastNameIndex {
    Person ref;
    LastNameIndex next;

    public void showNexPersons(String s){
        LastNameIndex tmp=this;
        while(tmp!=null){
            System.out.printf(" %12s earns \t%4d\n", tmp.ref.getLastName(), tmp.ref.getIncome());
            tmp=tmp.next;
        }
        System.out.println();
    }
}

class IncomeIndex {
    Person ref;
    IncomeIndex next;

    public void showNexPersons(String s){
        IncomeIndex tmp=this;
        while(tmp!=null){
            System.out.printf(" %12s earns \t%4d\n", tmp.ref.getLastName(), tmp.ref.getIncome());
            tmp=tmp.next;
        }
        System.out.println();
    }
}

enum Status{
    SEARCH, FINISH
}

public class Database {
    CardIndex index = new CardIndex();
    LastNameIndex headN, tailN;
    IncomeIndex headZ, tailZ;


    public Database() {
        headN = tailN = null;
        headZ = tailZ = null;
    }
}

