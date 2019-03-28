package pl.javaudemy;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private String email;
    private int mailboxCapacity;
    private String alternateEMail;
    private String companySuffix = "company.com";

    //contractor to receive the first name and the last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("E-mail created: " + this.firstName + " " + this.lastName);

        //call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department is "+this.department);

        //call a method that return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is "+this.password);

        //combine elements to create email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is " + email);
    }

    //ask for the department
    private String setDepartment() {
        System.out.print("Enter the department\n1 for Sales\n2 for Accounting\n3 for Development\n0 for none\n" +
                "Enter department number: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        }
        if (depChoice == 2) {
            return "accounting";
        }
        if (depChoice == 3) {
            return "development";
        } else {
            return "";
        }
    }

    //generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789&*%$$";
        char[]password = new char [length];
        Random random = new Random();
        for (int i = 0; i<length; i++){
            //generates random number from 0 to password's length -1
            int rand = random.nextInt(passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    //set the mailbox capacity

    //set the alternate email

    //change the password
}
