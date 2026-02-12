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

            while(true)
            {
                try
                {
                    String ageInput = userInput.next();
                    if (Validation.isExit(ageInput) == true) //need to check for "exit" to close the program.
                    {
                        break;
                    }
                    user1.setAge(Integer.parseInt(ageInput));
                    System.out.println(user1.getAge());
                    break;
                }//try
                catch (NumberFormatException e)
                {
                    System.out.println("please enter a valid age");
                }//catch



            }//while

            // ----------------------------------------------------------------------------


            // will check if user input is only letters
            // will check if  user input is was only 1 letter for gender
            // will ch

            System.out.println("Please enter the users gender");
            String gender = userInput.next();
            while(true)
            {
                System.out.println("please enter the users gender. type M for male or F for female");
                gender = userInput.next();

                while (Validation.IsOnlyLetters(gender) == false ) {             //checking to see if input is only letters
                    System.out.println("Only letters are aloud. please enter M for male or F for female");
                     gender = userInput.next();
                } //while
                while (Validation.isValidGender(gender) == false)
                {
                    System.out.println("Invalid Gender choice. please enter M for male or F for female");
                    gender = userInput.next();
                }

                if(Validation.isExit(gender))//looking for exit to close the program
                {
                    System.out.println("Exiting Program");
                    break;
                }

                user1.setGender(gender);
                System.out.println(user1.getGender());

                // ----------------------------------------------------------------------

            }//while


            //for testing
            System.out.println(user1.getFirstName());
            System.out.println(user1.getLastName());
            System.out.println(user1.getAge());

            break; // just terminating the program while I develop it.

        }//MENU EXIT VARIABLE
        
    }//psvm

}//class
