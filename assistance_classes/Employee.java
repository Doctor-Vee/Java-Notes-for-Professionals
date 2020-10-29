package assistance_classes;

public class Employee extends Person {

    public Employee(String gender) {
        this.gender = gender;
    }

    public Employee(int age, String name, String gender) {
        super(age, name);
        this.gender = gender;
    }

    private String gender;

    public Employee(int age, String name) {
        super(age, name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
