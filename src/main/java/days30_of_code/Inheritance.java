package days30_of_code;

import java.util.Scanner;

public class Inheritance extends Person{

    private int[] testScores;


    public Inheritance(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }


    public String calculate() {
        int score = 0;
        for (int value : this.testScores) {
            score+=value;
        }
        score/=testScores.length;
        String grade = "";
        if(score >= 90 && score <= 100) {
            grade = "O";
        } else if(score >= 80 && score < 90) {
            grade = "E";
        } else if(score >= 70 && score < 80) {
            grade = "A";
        } else if(score >= 55 && score < 70) {
            grade = "P";
        } else if(score >= 40 && score < 55) {
            grade = "D";
        } else if(score < 40 && score >= 0) {
            grade = "T";
        }
        return grade;
    }
}

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public Person() {
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Inheritance s = new Inheritance(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
