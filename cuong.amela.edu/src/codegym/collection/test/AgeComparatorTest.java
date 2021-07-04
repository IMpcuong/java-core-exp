package codegym.collection.test;

import codegym.collection.source.Student;
import codegym.collection.source.AgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgeComparatorTest {

    public static void main(String[] args) {
        Student student0 = new Student("Adam", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("John", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student0);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        System.out.println("Compare students with name: ");
        Collections.sort(lists);
        for (Student student : lists){
            System.out.println(student.toString());
        }

        AgeComparator comparator = new AgeComparator();
        Collections.sort(lists, comparator);
        System.out.println("Compare with age of students: ");
        for (Student student : lists) {
            System.out.println(student.toString());
        }
    }
}
