import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //String exitVariable;
        System.out.println("type exit to close program at any time");
        User user1 = new User(); // initializing user object
        Scanner userInput = new Scanner(System.in); // creating Scanner object to get user input.

        while(true) {

            System.out.println("please enter a user's first name");
            String firstName = userInput.next(); // getting initial user input

            // testing user input variable firstName for input validation to see if it only contains letters. if it passes then it will
            // be passed to User class's setter method setFirstName to set the first name field.

            while (Validation.IsOnlyLetters(firstName) == false) {
                System.out.println("please enter a first name using only letters");
                firstName = userInput.next();
            }

            if(Validation.isExit(firstName))//looking for exit to close the program
            {
                System.out.println("Exiting Program");
                break;
            }

            user1.setFirstName(firstName);
            System.out.println(user1.getFirstName());//for testing

            // ---------------------------------------------------------------------------

            System.out.println("Please enter the users Last name");
            String lastName = userInput.next();

            while (Validation.IsOnlyLetters(lastName) == false)
            {
                System.out.println("please enter a last name using only letters");
                lastName = userInput.next();
            }

            if(Validation.isExit(lastName))//looking for exit to close the program
            {
                System.out.println("Exiting Program");
                break;
            }

            user1.setLastName(lastName);
            System.out.println(user1.getLastName());//for testing

            // ---------------------------------------------------------------------------

            System.out.println("Please enter the users age");


        }//EXIT VARIABLE
        
    }//psvm

}//class
