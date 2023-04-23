/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part1;

/**
 *
 * @author ST10216108, Mohammed Rizwaan Cassim, PROG5121, POE-Part1
 */

public class Login {

    private String Username, Password;

    Login(String User, String Pass) {
        Username = User;
        Password = Pass;
    }

    public Login() {
    }

    //Username validation
    public boolean checkUserName(String Username) {
        if (Username.length() > 0 && Username.length() <= 5 && Username.contains("_")) {
            return true;
        } else {
            return false;
        }
    }
    
    //Password validation
    public boolean checkPasswordComplexity(String Password) {
        if (Password.length() >= 8 && Password.matches("[a-zA-Z0-9!@#$%&*()_+=|<>?{}\\[\\]~-]+")) {
            return true;
        } else {
            return false;
        }
    }

    //Registration check for Username & Password
    public String registerUser(String Username, String Password) {
        if (checkUserName(Username) == true) {
            if (checkPasswordComplexity(Password)) {
                return "The conditions have been met and therefore the user has been registered successfully";
            } else {
                return "The password does not meet the complexity requirements";
            }
        } else {
            return "The username is incorrectly formatted";
        }
    }

    //User login
    public boolean loginUser(String User, String Pass) {
        if (Username.equalsIgnoreCase(User) && Password.equalsIgnoreCase(Pass)) {
            return true;
        } else {
            return false;
        }

    }

    // If the user either logs in or fails to login 
    public String returnLoginStatus(String Username, String Password) {
        if (loginUser(Username, Password) == true) {
            return "A successful login";
        } else {
            return "An unsuccessful login";
        }
    }

    // If a user fails to add any value for names (first or last), an error will display.
    public boolean checkNames(String Name) {
        if (Name.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
