package entity;

public class Employee extends Person{
    private String position;
    private String password;
    private int yearsOfExperience;
    private String department;

    public Employee() {
    }

    public Employee(int id, String name, int age, String phoneNumber, String position, String password, int yearsOfExperience, String department) {
        super(id, name, age, phoneNumber);
        this.position = position;
        this.password = password;
        this.yearsOfExperience = yearsOfExperience;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", password='" + password + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", department='" + department + '\'' +
                "} " + super.toString();
    }
}
