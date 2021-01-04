package Homework9;

/*1) Написать функцию, принимающую список Student и возвращающую список уникальных курсов,
на которые подписаны студенты.
2) Написать функцию, принимающую на вход список Student и возвращающую
список из трех самых любознательных (любознательность определяется количеством курсов).
3) Написать функцию, принимающую на вход список Student и экземпляр Course,
возвращающую список студентов, которые посещают этот курс.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IStudent> students = new ArrayList<>(Arrays.asList(
        new Student(name: "Ivanov", new ArrayList<>(Arrays.asList(new Course(title: "Art"), new Course(title:"Math")))),
        new Student(name: "Petrov", new ArrayList<>(Arrays.asList(new Course(title: "Java"), new Course(title:"Math")))),
        new Student(name: "Popov", new ArrayList<>(Arrays.asList(new Course(title: "English"), new Course(title:"Math"), new Course(title: "Art")))),
        new Student(name: "Sidorov", new ArrayList<>(Arrays.asList(new Course(title: "Java"), new Course(title:"Art")))),
        ));

        System.out.println("\n==== List of the unique courses ====");

        students.stream()
                .flatMap(s -> s.getAllCourses().stream())
                .map(ICourse::getTitle)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n==== List of the most curious students ====");

        students.stream()
                .sorted(new CuriousComparator())
                .limit(3)
                .forEach(s -> System.out.println(s.getName() + ": " + s.getAllCourses().size()));

        System.out.println("\n==== List of the students for Art course====");

        ICourse course = new Course(title: "Art");
        students.stream()
                .filter(s -> s.getAllCourses().stream().anyMatch(c -> c.getTitle().equals(course.getTitle())))
                .forEach(s -> System.out.println(s.getName() + " посещает " + course.getTitle()));

    }
}
