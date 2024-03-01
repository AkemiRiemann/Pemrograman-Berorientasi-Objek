import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseCode;
    String courseName;
    Lecture lecture;
    List<Student> studentsEnrolled;

    Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    String getCourseName(){
        return this.courseName;
    }

    void addStudent(Student student) {
        if (!this.studentsEnrolled.contains(student)){
            this.studentsEnrolled.add(student);
            student.coursesEnrolled.add(this);
        }
    }

    void removeStudent(Student student) {
        this.studentsEnrolled.remove(student);
    }

    void viewEnrolledStudents() {
        System.out.println("=========== " + this.courseName + " Students List ==========");
        for (Student student: this.studentsEnrolled){
            System.out.println(student.getName());
        }
    }

    void getDetails() {
        System.out.println("========== Course Details ==========");
        System.out.println(String.format("Couse Code: %s", this.courseCode));
        System.out.println(String.format("Course Name: %s", this.courseName));
        System.out.println(String.format("Lecturer Name: %s", this.lecture.getName()));
    }      
}
