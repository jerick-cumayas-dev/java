import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input;
        populateUsers(users);

        do {
            displayUsers(users);
            showInstructions();
            input = scanner.nextInt();
            showOptions();
            int option = scanner.nextInt();
            updateUser(users, input, option);
        } while (input != -1);

    }

    public static void showInstructions(){
        System.out.print("Input index of user to edit: ");
    }

    public static void showOptions(){
        System.out.println("Menu: ");
        System.out.println("1. First Name");
        System.out.println("2. Middle Name");
        System.out.println("3. Last Name");
        System.out.println("4. Salary");
        System.out.println("5. Department");
        System.out.print("Choice: ");
    }

    public static void updateUser(ArrayList<Employee> users, int input, int option){
        Scanner scanner = new Scanner(System.in);
        Employee updatedUser = null;

        for (int i = 0; i < users.size(); i++) {
            if (i == input){
                updatedUser = users.get(i);
            }
        }

        switch (option){
            case 1:
                try {
                    System.out.print("Input new first name: ");
                    if (updatedUser != null){
                        updatedUser.setFirstName(scanner.nextLine());
                    }

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                    System.out.print("Input new middle name: ");
                    assert updatedUser != null;
                    updatedUser.setMiddleName(scanner.nextLine());
                break;
            case 3:
                    System.out.print("Input a new last name: ");
                    assert updatedUser != null;
                    updatedUser.setLastName(scanner.nextLine());
                break;
            case 4:
                    System.out.print("Input a new salary: ");
                    assert updatedUser != null;
                    updatedUser.setSalary(scanner.nextFloat());
                break;
            case 5:
                    System.out.print("Input a new department: ");
                    assert updatedUser != null;
                    updatedUser.setDepartment(scanner.nextLine());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
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