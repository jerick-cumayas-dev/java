public class Employee extends User{
    private double salary;
    private String department;

    public Employee(String firstName, String middleName, String lastName, double salary, String department){
        super(firstName, middleName, lastName);
        this.salary = salary;
        this.department = department;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
}
