import java.util.HashMap;

public class Teachers extends Staff{

    public Teachers(String name, int age, String address, int height, String role) {
        super(name, age, address, height, role);
    }

    public void teachCourse(){
        Principal principal = new Principal();
        String assignedCourse = principal.assignedCourse;
        System.out.println(" teaching " + assignedCourse);
    }

    public void gradeStudents(Students student, int score){
        HashMap<String, Integer> studentsRecord = new HashMap<>();
        String studentName = student.name;
        studentsRecord.put(studentName, score);
//        studentsRecord.put();
    }

    public void updateDisturbanceRecord(Students student){

//        student.disturbanceRecord;

    }

}
