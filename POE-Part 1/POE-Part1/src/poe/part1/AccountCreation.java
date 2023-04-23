/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part1;

/**
 *
 * @author ST10216108, Mohammed Rizwaan Cassim, PROG5121, POE-Part1
 */

public class AccountCreation {

    private String Username, Password, FirstName, LastName;

    public AccountCreation(String Username, String Password, String FirstName, String LastName) {
        super();

        this.Username = Username;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        return "[Username=" + " " + Username + ", Password=" + " " + Password + ", FirstName=" + " " + FirstName
                + ", LastName=" + " " + LastName + "]";
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

}
