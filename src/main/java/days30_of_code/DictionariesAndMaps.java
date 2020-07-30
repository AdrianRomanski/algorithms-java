package days30_of_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
public class DictionariesAndMaps {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> contacts = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contacts.putIfAbsent(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(contacts.get(s) != null) {
                System.out.println(s + "=" +contacts.get(s));
            } else {
                    System.out.println("Not found");
                }
        }
        in.close();
    }
}

