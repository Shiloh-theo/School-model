import java.util.ArrayList;
import java.util.List;

public class Class {

    String name;
    int noOfStudents;
    List<Students> classStudents = new ArrayList<>();
    List<Course> classCourse = new ArrayList<>();

    public Class(String name) {
        this.name = name;
        this.noOfStudents = noOfStudents;
        this.classStudents = classStudents;
        this.classCourse = classCourse;
    }

    public void addStudents(Students student){
        classStudents.add(student);
    }

    public void removeStudents(Students student){
        classStudents.remove(student);
    }

    public List<Students> seeAllStudents(){
        if(classStudents.isEmpty()){
            System.out.println("there are no students in the class");
        }else{
            System.out.println(" Students in the class are: \n");
            for(int i = 0; i < classStudents.size(); i++){
                System.out.println(classStudents.get(i).name);
            }
        }
        return classStudents;
    }

    public void addCourse(Course course){
        classCourse.add(course);
    }

    public void removeCourse(Course course){
        classCourse.remove(course);
    }

    public List<Course> seeAllCourses(){
        return classCourse;
    }

}
