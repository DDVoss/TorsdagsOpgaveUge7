package Task3;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    Student(String name, ArrayList<String> completedCourses) {
        super(name);
        this.passedCourses = completedCourses;
    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }
}