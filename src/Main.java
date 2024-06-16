import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        populateUsers(users);
        displayUsers(users);
    }

    public static void populateUsers(ArrayList<User> users){
        users.add(new User("Jerick Royce", "Delcoro", "Cumayas"));
        users.add(new User("Charles Christian", "Delcoro", "Cumayas"));
        users.add(new User("Princess Ericka", "Delcoro", "Cumayas"));
    }

    public static void displayUsers(ArrayList<User> users){

        if (users.size() == 0){
            System.out.println("Users empty.");
        }

        for (int i = 0; i < users.size(); i++){
            User user = users.get(i);
            System.out.println("User " + i);
            System.out.println("First Name :" + user.getFirstName());
            System.out.println("Middle Name :" + user.getMiddleName());
            System.out.println("Last Name :" + user.getLastName());
            System.out.println();
        }
    }
}