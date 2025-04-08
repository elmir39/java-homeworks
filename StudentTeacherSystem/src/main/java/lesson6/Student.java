package lesson6;

import java.util.Map;
import java.util.HashMap;

public class Student extends Human{
    private String studentId;
    private Map<String, Double> coursesAndMarks;
    private double averageMark;


    public Student(String studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
        this.averageMark = 0.0;
        this.coursesAndMarks = new HashMap<>();
    }

    public Student(String studentId, String name, int age, double averageMark) {
        super(name, age);
        this.studentId = studentId;
        this.averageMark = averageMark;
        this.coursesAndMarks = new HashMap<>();
    }

    public Student(String studentId, String name, int age, Map<String, Double> coursesAndMarks, double averageMark) {
        super(name, age);
        this.studentId = studentId;
        this.coursesAndMarks = coursesAndMarks;
        this.averageMark = averageMark;
    }

    public Student() {
        this.coursesAndMarks = new HashMap<>();
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Map<String, Double> getCoursesAndMarks() {
        return coursesAndMarks;
    }

    public void setCoursesAndMarks(Map<String, Double> marks) {
        this.coursesAndMarks = marks;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void addMarkByName(String courseName, double mark) {
        coursesAndMarks.put(courseName, mark);
    }

    public void addCourse(Course course) {
        if (!coursesAndMarks.containsKey(course.getName())) {
            coursesAndMarks.put(course.getName(), 0.0);
            course.addStudent(this);
        }
    }

    public void removeCourse(Course course) {
        if (coursesAndMarks.containsKey(course.getName())) {
            coursesAndMarks.remove(course.getName());
            course.removeStudent(this);
        }
    }

    public void calculateAverageMark() {
        if (coursesAndMarks.isEmpty()) {
            averageMark = 0.0;
            return;
        }
        double totalMarks = 0.0;
        int count = 0;
        for (double mark : coursesAndMarks.values()) {
            if (mark > 0) {
                totalMarks += mark;
            } else {
                count++;
            }
        }
        averageMark = totalMarks / coursesAndMarks.size() - count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", averageMark=" + averageMark +
                ", coursesAndMarks=" + coursesAndMarks +
                '}';
    }
}
