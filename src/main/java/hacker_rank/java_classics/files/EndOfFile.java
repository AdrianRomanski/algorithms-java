package hacker_rank.java_classics.files;

import java.util.Scanner;
//The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
public class EndOfFile {

    public static void main(String[] args) {

        int count = 0;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            count+=1;
            String s = sc.nextLine();
            sb.append(count + " " + s + "\n");
        }
        System.out.println(sb.toString());
    }
}
