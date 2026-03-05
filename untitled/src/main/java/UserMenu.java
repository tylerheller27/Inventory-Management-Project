import java.util.Scanner;

public class UserMenu {

    ObjectStorage storage;
    Scanner scanner;

    public UserMenu(ObjectStorage storage, Scanner scanner) //
    {
        this.storage = storage;
        this.scanner = scanner;
    }

public void run()
{

    System.out.println("type exit to close program at any time");

    User user1 = new User(); // initializing user object // maybe move in while loop to enable the ability to create
    // multiple user at sequentially.
    Scanner userInput = new Scanner(System.in); // creating Scanner object to get user input.

    while(true) {//menu loop for collecting user/employee info

        System.out.println("please enter a user's first name");
        String firstName = userInput.next(); // getting initial user input

        // testing user input variable firstName for input validation to see if it only contains letters. if it passes then it will
        // be passed to User class's setter method setFirstName to set the first name field.

        while (Validation.isOnlyLetters(firstName) == false) {
            System.out.println("please enter a first name using only letters");
            firstName = userInput.next();
        }

        if(Validation.isExit(firstName))//looking for exit to close the program
        {
            System.out.println("Exiting User creation. Returning to Main Menu \n");
            return;//      *******************change to return.
        }

        user1.setFirstName(firstName);
        System.out.println(user1.getFirstName());//for testing

        // ********************************************************************************************************

        System.out.println("Please enter the users Last name");
        String lastName = userInput.next();

        while (Validation.isOnlyLetters(lastName) == false)
        {
            System.out.println("please enter a last name using only letters");
            lastName = userInput.next();
        }

        if(Validation.isExit(lastName))//looking for exit to close the program
        {
            System.out.println("Exiting Program");
            System.exit(0);
        }

        user1.setLastName(lastName);
        System.out.println(user1.getLastName());//for testing

        // *****************************************************************************************************

        System.out.println("Please enter the users age");

        while(true)
        {
            // if ageInput is incorrect and throws an exception, the catch block will prompt the user to enter a
            // valid age then the continue statement will start the loop over to get user input again
            String ageInput = userInput.next();
            try {

                if (Validation.isExit(ageInput)) //need to check for "exit" to close the program.
                {
                    System.exit(0);
                }//

                user1.setAge(Integer.parseInt(ageInput));
                System.out.println(user1.getAge());
                break; //exit out of loop if we are successfully able use setAge();

            }//try
            catch (NumberFormatException e)
            {
                System.out.println("please enter a valid age");
                continue;
            }//catch
        }//while loop user age

        // ******************************************************************************************************


        // will check if user input is only letters
        // will check if  user input is was only 1 letter for gender
        // will ch

        System.out.println("Please enter the users gender");
        String gender = userInput.next();
        while(true)
        {

            if(Validation.isExit(gender))//looking for exit to close the program
            {
                System.out.println("Exiting Program");
                System.exit(0);
            }

            while (Validation.isValidGender(gender) == false)
            {
                System.out.println("Invalid Gender choice. please enter M for male or F for female");
                gender = userInput.next();
            }

            user1.setGender(gender);
            System.out.println(user1.getGender());
            break;

            // ----------------------------------------------------------------------

        }//while


        //for testing
        System.out.println(user1.getFirstName());
        System.out.println(user1.getLastName());
        System.out.println(user1.getAge());
        System.out.println(user1.getGender());

        break; // just terminating the program while I develop it.

    }//MENU EXIT VARIABLE




}//run

}//class
