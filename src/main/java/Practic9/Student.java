package Practic9;

import java.util.List;
import java.util.stream.Collectors;

public class Student {
}
interface Student {
    String getName();
    String getCourse();
    List<Student> students = Arrays.aslist(
            new Student("Ivan", course: History),
            new Student("Petr", course: Math),
    new Student("Mark", course: Art),


    List<Course> getAllCourses();
}
interface Course {}

Stream of(new Student[])
    List<String>Studentnames(Stream<Student> courseStream {
        courseStream.map(student -> student.name).collect(Collectors.toList());
    }

/*Написать функцию, принимающую список Student и возвращающую список уникальных курсов,
на которые подписаны студенты.
Написать функцию, принимающую на вход список Student и возвращающую
список из трех самых любознательных (любознательность определяется количеством курсов).
Написать функцию, принимающую на вход список Student и экземпляр Course,
возвращающую список студентов, которые посещают этот курс.
 */