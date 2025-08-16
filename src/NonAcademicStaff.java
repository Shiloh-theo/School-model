import java.util.ArrayList;
import java.util.List;

public class NonAcademicStaff extends Staff{

    public NonAcademicStaff(String name, int age, String address, int height, String role) {
        super(name, age, address, height, role);
    }

    List<NonAcademicStaff> nonAcademicStaffList = new ArrayList<>();

    public String performRole(){
        return "performing role of " + role;
    }

    public void addStaff(NonAcademicStaff nonAcademicStaff){
        nonAcademicStaffList.add(nonAcademicStaff);
    }

    public void removeStaff(NonAcademicStaff nonAcademicStaff){
        nonAcademicStaffList.remove(nonAcademicStaff);
    }

    public List<NonAcademicStaff> listNonAcademicStaffs(){
        return nonAcademicStaffList;
    }

}
