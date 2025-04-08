package lesson6;

public class Teacher extends Human {
    private String teacherId;
    private String courseName;


    public Teacher(String teacherId, String name, int age, String courseName) {
        super(name, age);
        this.teacherId = teacherId;
        this.courseName = courseName;
    }

    public Teacher(String teacherId, String name, int age) {
        super(name, age);
        this.teacherId = teacherId;
        this.courseName = "N/A";
    }


    public Teacher() {
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void addCourse(Course course) {
        if (courseName.equals("N/A")) {
            courseName = course.getName();
            course.addTeacher(this);
        }
    }

    public void removeCourse(Course course) {
        if (courseName.equals(course.getName())) {
            courseName = "N/A";
            course.removeTeacher(this);
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Teacher)) return false;
        Teacher teacher = (Teacher) obj;
        return teacherId.equals(teacher.teacherId);
    }

    @Override
    public int hashCode() {
        return teacherId.hashCode();
    }


}
