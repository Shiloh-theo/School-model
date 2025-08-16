import java.util.ArrayList;
import java.util.List;

public class Students extends Person {


    int studentId;
    int disturbanceRecord;
    Class studentClass;
    List<Course> courses = new ArrayList<>();

    public Students(String name, int age, String address, int height, int studentId, int disturbanceRecord, Class studentClass, List<Course> courses) {
        super(name, age, address, height);
        this.studentId = studentId;
        this.disturbanceRecord = disturbanceRecord;
        this.studentClass = studentClass;
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> listCourses() {
        return courses;
    }

    public void takeCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }



}
