package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String companySuffix = "intel.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("Email created:" + this.firstName + " " + this.lastName);

        // call a method asking for the department -  return the department
        this.department = setDepartment();
        // System.out.println("department:" + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is:" + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + '.' + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        // System.out.println("your email is:" + email);
    }

    // Ask for the department
    private String setDepartment(){
        System.out.print("New worker:" + firstName +"." + " Department codes:\n1 for Sales\n2 for development\n3 for accounting\n0 for none\n Enter department code:");
        Scanner in = new Scanner(System.in);
        int deptCode = in.nextInt();
        if(deptCode == 1){
            return "Sales";
        }else if (deptCode == 2){
            return "dev";
        }else if (deptCode == 3){
            return "accnt";
        }else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTWXYZ123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String altEMail){
        this.alternateEmail = altEMail;
    }

    // change the password
    public void setPassword(String password){
        this.password = password;
    }

    // get

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME:" + firstName + " " + lastName +
                "\nCOMPANY EMAIL:" + email +
                "\nMAILBOX CAPACITY:" + mailboxCapacity + "mb";
    }
}
