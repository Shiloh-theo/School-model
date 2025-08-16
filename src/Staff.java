public class Staff extends Person {

    String role;

    public Staff(String role) {
        this.role = role;
    }

    public Staff(String name, int age, String address, int height, String role) {
        super(name, age, address, height);
        this.role = role;
    }

    public Staff() {

    }
}
