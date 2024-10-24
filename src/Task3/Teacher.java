package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    Teacher(String name, ArrayList<String> teachable)   {
        super(name);
       this.canTeach = teachable;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course))   {
            currentCourses.add(course);
            return true;
        }else{
            return false;
        }
    }
}
