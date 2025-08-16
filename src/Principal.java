public class Principal extends Staff{

    Gender gender;
    String assignedCourse;

    public Principal(String name, int age, String address, int height, String role) {
        super(name, age, address, height, role);
    }

    public Principal() {
        super();
    }

    public void admitApplicants(Applicants applicant){

        if(applicant.age <= 20 || applicant.degree == null){
            System.out.println("sorry not suitable for the role");
        }else{
            System.out.println("congratulations");
        }
    }

     public void expelStudent(Students student){
        if(student.disturbanceRecord > 4){
            System.out.println("up for expulsion");
        }
     }

     public String assignCourseToTeacher(Applicants applicant){
        if(applicant.degree == applicant.subjectApplication){
            assignedCourse = applicant.getSubjectApplication();
            return assignedCourse;
        }
        return "unsuccessful application";
     }
}
