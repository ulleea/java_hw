package start;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Student {

    private String name;
    private List<Integer> marks = new ArrayList<Integer>();
    private Predicate<Integer> mark_tester(int mark){
        return p -> p<11 && 0<p;
    }

    public Student(String name_input) {
        name = name_input;
    }

    public Student(String name_input, String type, ArrayList<Integer> marks_input) {
        name = name_input;
        marks = new ArrayList<Integer>(marks_input);
    }

    public String show_marks() {
        StringBuilder ans = new StringBuilder();
        for (int mark : marks) {
            ans.append(mark).append(", ");
        }
        return ans.toString();
    }

    public void delete_mark(int index) {
        marks.set(index, 0);
    }

    public void add_mark(int mark) {
        if (mark <11 && 0<mark) {
            marks.add(mark);
        } else {
            throw new IllegalArgumentException(mark + " is not valid");
        }
    }

    public void set_name(String setname) {
        name=setname;
    }

    public String show_name(){
        return name;
    }

    @Override
    public String toString() {
        String ans = "";
        ans += name + " [" + this.show_marks() + "]";
        return ans;
    }

    public boolean equals(Student student2) {
        return name.equals(student2.name) && marks.equals(student2.marks);
    }

    public static void main(String[] args){
        System.out.print("Starting testing");
    }
}