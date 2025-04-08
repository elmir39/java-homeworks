package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    public Course(String name, List<Student> students, List<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }
    public Course() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }



    public void addStudent(Student student) {
        students.add(student);
        student.addCourse(this);
    }
    public void removeStudent(Student student) {
        students.remove(student);
        student.removeCourse(this);
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.addCourse(this);
    }
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
        teacher.removeCourse(this);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", teachers=" + teachers +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
