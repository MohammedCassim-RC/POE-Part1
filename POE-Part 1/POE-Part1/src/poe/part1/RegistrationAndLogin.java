/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part1;

import java.util.Scanner;

/**
 *
 * @author ST10216108, Mohammed Rizwaan Cassim, PROG5121, POE-Part1
 */

public class RegistrationAndLogin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Login accessMethods = new Login();

        // Username creation
        System.out.print("Please enter a username to create an account : ");
        String UsernameInput = in.nextLine();

        while (!accessMethods.checkUserName(UsernameInput)) {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length! \nPlease try again. ");

            System.out.print("Please re-enter a username : ");

            UsernameInput = in.nextLine();
        }

        // Password creation
        System.out.print("Please enter a  password to create an account : ");
        String PasswordInput = in.nextLine();

        while (!accessMethods.checkPasswordComplexity(PasswordInput)) {
            System.out.println("Username is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special character! \nPlease try again.");

            System.out.print("Please re-enter a password : ");

            PasswordInput = in.nextLine();
        }

        // First name creation
        System.out.print("Please enter your first name to create an account: ");
        String FirstNameInput = in.nextLine();

        while (!(accessMethods.checkNames(FirstNameInput))) {
            System.out.println("The first name entered here is invalid");

            System.out.print("Please re-enter your first name : ");
            FirstNameInput = in.nextLine();
        }

        // Last name creation
        System.out.print("Please enter your last name to create an account: ");
        String LastNameInput = in.nextLine();

        while (!(accessMethods.checkNames(LastNameInput))) {
            System.out.println("The last name entered here is invalid, please try again.");

            System.out.print("Please re-enter your last name : ");
            LastNameInput = in.nextLine();
        }

        AccountCreation accountCreated = new AccountCreation(UsernameInput, PasswordInput, FirstNameInput, LastNameInput);

        System.out.println("The information for the account you just created : " + " " + accountCreated.toString()); // Details for the account that had just been created to assist with logging in

        // Log in to account that had just been created
        System.out.print("Please enter your username to LOGIN : ");
        String UsernameLogin = in.nextLine();

        System.out.print("Please enter your password to LOGIN : ");
        String PasswordLogin = in.nextLine();

        // Upon successful or unsuccessful login, these messages will be displayed.
        Login login_user = new Login(UsernameLogin, PasswordLogin);

        if (login_user.loginUser(accountCreated.getUsername(), accountCreated.getPassword())) {

            System.out.println(login_user.returnLoginStatus(accountCreated.getUsername(), accountCreated.getPassword()));

            System.out.println("You now have access to your account");
        } else {
            System.out.println(login_user.returnLoginStatus(accountCreated.getUsername(), accountCreated.getPassword()));

            System.out.println("You have been denied access to your account.");
        }

    }
}
