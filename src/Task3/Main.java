package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args) {
        ArrayList<String> StudentCourses = new ArrayList<>();
        ArrayList<String> canTeachCourses = new ArrayList<>();
        StudentCourses.add("Java 0.1");
        canTeachCourses.add("Java for Beginners");



        Student studA = new Student("Harold Thomsen",StudentCourses);
        Student studB = new Student("Peter Palle",StudentCourses);
        Student studC = new Student("Alberto Gonzales",StudentCourses);

        Teacher teachA = new Teacher("Daniel Voss",canTeachCourses);
        Teacher teachB = new Teacher("Jesper Kock",canTeachCourses);
        Teacher teachC = new Teacher("Tess Gaston",canTeachCourses);




    }
}
