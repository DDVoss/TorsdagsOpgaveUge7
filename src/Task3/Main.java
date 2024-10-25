package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args) {
        ArrayList<String> StudentCourses = new ArrayList<>();
        ArrayList<String> canTeachCourses = new ArrayList<>();
        StudentCourses.add("Java");
        canTeachCourses.add("Java for Beginners");



        Student studA = new Student("Harold Thomsen",StudentCourses);
        Student studB = new Student("Peter Palle",StudentCourses);
        Student studC = new Student("Alberto Gonzales",StudentCourses);

        Teacher teachA = new Teacher("Daniel Voss",canTeachCourses);
        Teacher teachB = new Teacher("Jesper Kock",canTeachCourses);
        Teacher teachC = new Teacher("Tess Gaston",canTeachCourses);

        ArrayList<Person> students = new ArrayList<>();
        students.add(studA);
        students.add(studB);
        students.add(studC);

        ArrayList<Person> teachers = new ArrayList<>();
        teachers.add(teachA);
        teachers.add(teachB);
        teachers.add(teachC);

        String subjectA = "Java";
        for(Person sa : students) {
            if (sa.addCourse(subjectA)){
                System.out.println(sa.getName() + "just started studying" + subjectA);
            } else {
                System.out.println(sa.getName() + " have already completed the " + subjectA +" course");
            }
            //sa.addCourse("C++");
        }


    }
}
