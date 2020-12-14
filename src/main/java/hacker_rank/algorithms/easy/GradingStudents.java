package hacker_rank.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {

        List<Integer> grades = Arrays.asList(73,67,38,33);

        List<Integer> fixedGrades = gradingStudents(grades);

        for(int i: fixedGrades) {
            System.out.println(i);
        }

    }


    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> fixedGrades = new ArrayList<>();
        for(int i: grades) {
            if(i >= 38) {
                if(i % 5 >= 3)
                    fixedGrades.add(i+(5-(i % 5)));
                else
                    fixedGrades.add(i);
            } else
                fixedGrades.add(i);
        }
        return fixedGrades;
    }

}
