package Homework9;

public class Student implements IStudent {

    private final String name;
    private final List<ICourse> courses;

    public Student(String name, List<ICourse> courses){
        this.name = name;
        this.courses = courses;
    }

    public String getName() { return name; }

    public List<ICourse> getAllCourses() { return courses; }
}
