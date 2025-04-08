package lesson6;

import java.util.HashMap;
import java.util.Map;

public class Exams {
    private Map<String, Map<String, Double>> courseStudentMarks;

    public Exams() {
        this.courseStudentMarks = new HashMap<>();
    }

    public Exams(Map<String, Map<String, Double>> courseStudentMarks) {
        this.courseStudentMarks = courseStudentMarks;
    }


    public Map<String, Map<String, Double>> getCourseStudentMarks() {
        return courseStudentMarks;
    }
    public void setCourseStudentMarks(Map<String, Map<String, Double>> courseStudentMarks) {
        this.courseStudentMarks = courseStudentMarks;
    }


    public void addMark(Course course, Student student, double mark) {
        courseStudentMarks.putIfAbsent(course.getName(), new HashMap<>());
        courseStudentMarks.get(course.getName()).put(student.getName(), mark);
        student.getCoursesAndMarks().put(course.getName(), mark);
        student.calculateAverageMark();
    }

    public void removeMark(Course course, Student student) {
        if (courseStudentMarks.containsKey(course.getName())) {
            courseStudentMarks.get(course.getName()).remove(student.getStudentId());
            student.getCoursesAndMarks().put(course.getName(), 0.0);
            student.calculateAverageMark();
        }
    }

    public Double getMark(Course course, Student student) {
        if (courseStudentMarks.containsKey(course.getName())) {
            return courseStudentMarks.get(course.getName()).get(student.getStudentId());
        }
        return null;
    }

    public Map<String, Double> getMarksForCourse(Course course) {
        return courseStudentMarks.getOrDefault(course.getName(), new HashMap<>());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Map<String, Double>> entry : courseStudentMarks.entrySet()) {
            sb.append("Course: ").append(entry.getKey()).append("\n");
            for (Map.Entry<String, Double> studentEntry : entry.getValue().entrySet()) {
                sb.append("Student: ").append(studentEntry.getKey()).append(", Mark: ").append(studentEntry.getValue()).append("\n");
            }
        }
        return sb.toString();
    }
}