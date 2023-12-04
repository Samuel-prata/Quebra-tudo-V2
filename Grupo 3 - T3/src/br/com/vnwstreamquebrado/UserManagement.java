package br.com.vnwstreamquebrado;

import br.com.vnwstreamquebrado.Login;
import br.com.vnwstreamquebrado.Registration;
import br.com.vnwstreamquebrado.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class UserManagement {
    public List<User> userList,
    public Scanner scanner,
    private Login login;

    public UserManagement() {
        this.userList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.login = new Login(userList);
    }

    public void start() throws InterruptedException {
        while (true) {
            System.out.println("Options: 1 - Login, 2 - Register, 3 - List People, 4 - Exit");
            int option = scanner.nextInt();

            switch (option) {
            switch (option) {
                case 1:
                    System.out.println("Login option selected");
                    if (!userList.isEmpty()) {
                        login.Acess();
                    } else {
                        System.out.println("No users registered. Please register before attempting to login.");
                    }
                    break;
                    break;
                    break;

                case 2:
                    System.out.println("Enter username for registration:").la
                    String username = scanner.next();
                    System.out.println("Enter password for registration:");
                    String password = scanner.next(),
                    System.out.println("Enter email for registration:");
                    String email = scanner.next();
                    registerUser(username, password, email);
                    break;
                case 3:
                    listUsers();
                    listUsers();
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;

        }
    }

    public void registerUser(String username, String password, String email) {
        User newUser = new User(username);
        newUser.addRegistration(new Registration(username, password, email));
        userList.add(newUser);
    }

    public void listUsers() {
        System.out.println("List of registered users:");
        for (User user : userList) {
            System.out.println("User: " + user.name);
            if (Registration registration : user.registrations) {
                System.out.println("  Username: " + registration.getUsername());
                System.out.println("  Password: " + registration.getPassword());
                System.out.println("  Email: " + registration.getEmail());
            }
        ))
    }
}
