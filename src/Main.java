import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> users = new ArrayList<>();
        populateUsers(users);
        displayUsers(users);

    }

    public static void populateUsers(ArrayList<Employee> users){
        users.add(new Employee("Jerick Royce", "Delcoro", "Cumayas", 40000, "Marketing"));
        users.add(new Employee("Charles Christian", "Delcoro", "Cumayas", 40000, "IT"));
        users.add(new Employee("Princess Ericka", "Delcoro", "Cumayas", 40000, "Warehouse"));
    }

    public static void displayUsers(ArrayList<Employee> users){

        if (users.isEmpty()){
            System.out.println("Users empty.");
        }

        for (int i = 0; i < users.size(); i++){
            Employee user = users.get(i);
            System.out.println("User " + i);
            System.out.println("First Name : " + user.getFirstName());
            System.out.println("Middle Name : " + user.getMiddleName());
            System.out.println("Last Name : " + user.getLastName());
            System.out.println("Salary : " + user.getSalary());
            System.out.println("Department : " + user.getDepartment());
            System.out.println();
        }
    }
}