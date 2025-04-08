package lesson6;

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        List<Course> coursesList = new ArrayList<>();
        List<Teacher> teachersList = new ArrayList<>();

        Course course1 = new Course("Math");
        Course course2 = new Course("Physics");
        Course course3 = new Course("Chemistry");

        coursesList.add(course1);
        coursesList.add(course2);
        coursesList.add(course3);

        Teacher teacher1 = new Teacher("T001", "Mr. Smith", 35);
        Teacher teacher2 = new Teacher("T002", "Ms. Johnson", 40);
        Teacher teacher3 = new Teacher("T003", "Dr. Brown", 45);

        teachersList.add(teacher1);
        teachersList.add(teacher2);
        teachersList.add(teacher3);

        Student student1 = new Student("S001", "Alice", 20);
        Student student2 = new Student("S002", "Bob", 22);
        Student student3 = new Student("S003", "Charlie", 21);

        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student2);
        course2.addStudent(student3);
        course3.addStudent(student1);

        teacher1.addCourse(course1);
        teacher2.addCourse(course2);
        teacher3.addCourse(course3);

        Exams exams = new Exams();
        exams.addMark(course1, student1, 85.0);
        exams.addMark(course1, student2, 90.0);
        exams.addMark(course2, student2, 88.0);
        exams.addMark(course2, student3, 92.0);
        exams.addMark(course3, student1, 95.0);
        exams.addMark(course3, student2, 80.0);
        exams.addMark(course3, student3, 78.0);

        GenerateJsonFiles jsonGenerator = new GenerateJsonFiles();
        jsonGenerator.writeExamsJson(exams);
        jsonGenerator.writeStudentJson(studentsList);
        jsonGenerator.writeCourseJson(coursesList);
        jsonGenerator.writeTeacherJson(teachersList);
    }
}