package lesson6;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.*;

public class GenerateJsonFiles {

    private static abstract class IgnoreCourseStudent {
        @JsonIgnore
        abstract Map<String, Double> getCoursesAndMarks();
    }

    public void writeStudentJson (List<Student> studentsList) {
        try {
            ObjectMapper studentJsonMapper = new ObjectMapper();
            studentJsonMapper.enable(SerializationFeature.INDENT_OUTPUT);

            studentJsonMapper.writeValue(new File("students.json"), studentsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeCourseJson (List<Course> coursesList) {
        try {
            ObjectMapper courseJsonMapper = new ObjectMapper();
            courseJsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
            courseJsonMapper.addMixIn(Student.class, IgnoreCourseStudent.class);
            courseJsonMapper.writeValue(new File("courses.json"), coursesList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeTeacherJson (List<Teacher> teachersList) {
        try {
            ObjectMapper teacherJsonMapper = new ObjectMapper();
            teacherJsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
            teacherJsonMapper.writeValue(new File("teachers.json"), teachersList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeExamsJson (Exams exams) {
        try {
            ObjectMapper examsJsonMapper = new ObjectMapper();
            examsJsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
            examsJsonMapper.writeValue(new File("exams.json"), exams);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
