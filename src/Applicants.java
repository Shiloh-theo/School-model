public class Applicants extends Person{
    String degree;
    String subjectApplication;

    public Applicants(String name, int age, String address, int height, String degree, String subjectApplication) {
        super(name, age, address, height);
        this.degree = degree;
        this.subjectApplication = subjectApplication;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSubjectApplication() {
        return subjectApplication;
    }

    public void setSubjectApplication(String subjectApplication) {
        this.subjectApplication = subjectApplication;
    }

    public void applyForCourse(String CV){
        System.out.println("copy of CV " + CV + " with a degree in " + degree
        + " applying for " + subjectApplication);
    }
}
