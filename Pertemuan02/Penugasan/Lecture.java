import java.util.ArrayList;
import java.util.List;

public class Lecture {
    String name;
    int age;
    String address;
    String employeeID;
    List<Course> coursesTaught;

    Lecture(String name, int age, String address, String employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    String getName(){
        return this.name;
    }

    void getDetails() {
        System.out.println("========== Lecturer Details ==========");
        System.out.println(String.format("Name: %s", this.name));
        System.out.println(String.format("Age: ", this.age));
        System.out.println(String.format("Address: %s", this.address));
        System.out.println(String.format("Employee ID: %s", this.employeeID));
    }    

    void teachCourse(Course course) {
        if (!this.coursesTaught.contains(course)){
            this.coursesTaught.add(course);
            course.lecture = this;
        }
    }

    void viewTaughtCourses() {
        System.out.println("=========== " + this.name + "'s Taught Courses List ==========");
        for (Course course: coursesTaught){
            System.out.println(course.getCourseName());
        }
    }
}
