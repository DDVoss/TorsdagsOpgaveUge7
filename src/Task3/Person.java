package Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Person {
    String name;
    Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean addCourse(String course);
}
