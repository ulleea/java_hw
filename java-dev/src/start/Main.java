package start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        show_name_constr1();
        show_name_constr2();
        marks();
        equality();
    }

    public static Student show_name_constr1() {
        Student student = new Student("vasia");
        System.out.println("name " + student.show_name());
        student.set_name("katia");
        System.out.println("name " + student.show_name());
        System.out.println(student);
        System.out.println("show_name_constr1");
        System.out.println();
        return student;
    }

    public static void marks() {
        ArrayList<Integer> marks = new ArrayList<>();
        Integer[] list = {4, 5, 4, 4, 3};
        Collections.addAll(marks, list);
        Student student = new Student("vasia", marks);
        System.out.println("marks");
        System.out.println(student.show_marks());
        student.add_mark(4);
        student.add_mark(5);
        System.out.println(student.show_marks());
        student.delete_mark(1);
        System.out.println(student.show_marks());
        System.out.println();
    }

    public static Student show_name_constr2() {
        ArrayList<Integer> marks = new ArrayList<>();
        Integer[] list = {4, 5, 4, 4, 3};
        Collections.addAll(marks, list);
        Student student = new Student("vasia", marks);
        System.out.println("name " + student.show_name());
        student.set_name("lesha");
        System.out.println("name " + student.show_name());
        System.out.println(student);
        System.out.println("show_name_constr2");
        System.out.println();
        return student;
    }

    public static void equality() {
        Student student1 = new Student("vasia");
        student1.add_mark(4);
        student1.add_mark(5);
        ArrayList<Integer> marks = new ArrayList<>();
        Integer[] list = {4, 5};
        Collections.addAll(marks, list);
        Student student2 = new Student("vasia", marks);
        System.out.print(student1 + " - ");
        System.out.println(student2);
        System.out.print("equality: " );
        System.out.println(student1.equals(student2));
        student2.add_mark(5);
        System.out.print(student1 + " - ");
        System.out.println(student2);
        System.out.print("equality: " );
        System.out.println(student1.equals(student2));
        System.out.println();
    }
}
