package Homework9;

public class CuriousComparator implements java.util.Comparator<? super IStudent> {
    public int compare(IStudent o1, IStudent o2) {
        return o2.getAllCourses().size() - o1.getAllCourses().size();
    }
}
