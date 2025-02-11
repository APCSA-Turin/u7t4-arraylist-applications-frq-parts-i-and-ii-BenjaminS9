package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        boolean notSorted = true;
        while (notSorted) { //repeats until an iteration without any swaps to the list occurs
            notSorted = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getLastName().compareTo(list.get(i + 1).getLastName()) > 0) { //last name is alphabetically later
                    Student tempStudent = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tempStudent);
                    notSorted = true;
                } else if (list.get(i).getLastName().compareTo(list.get(i + 1).getLastName()) == 0) { //last name is the same
                    if (list.get(i).getFirstName().compareTo(list.get(i + 1).getFirstName()) > 0) { //first name is alphabetically later
                        Student tempStudent = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, tempStudent);
                        notSorted = true;
                    } else if (list.get(i).getFirstName().compareTo(list.get(i + 1).getFirstName()) == 0) { //first name is the same
                        if (list.get(i).getGpa() < list.get(i + 1).getGpa()) { //GPA is greater
                            Student tempStudent = list.get(i);
                            list.set(i, list.get(i + 1));
                            list.set(i + 1, tempStudent);
                            notSorted = true;
                        }
                    }
                }
            }
        }
        return list;
    }

}
