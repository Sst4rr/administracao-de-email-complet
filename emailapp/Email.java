package emailapp;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
 
    //constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);

        //call a method asking for the departament - return the department


   
    }


    //ask for the department
    // private String setDepartament(){
    //     System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\0 for none");
    //     Scanner in = new Scanner(System.in);
    //     depChoice = in.nextInt();
    //     if (depChoice == 1){ return "sales" ;}
    //     else if (depChoice == 2){return "dev" ;}
    //     else if (depChoice == 3){return "acct" ;}
    //     else {return "";}
    // }
    

    //generate a random password

    //set the mailbox capacity

    //set the alternate email

    //change the password

}