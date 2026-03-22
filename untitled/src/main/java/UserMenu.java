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

    //at least one department is required to
    if(storage.isDepartmentArrayListEmpty())
    {
        System.out.println("you need to create at least one department before creating employees!");
        System.out.println("please create a department\n");
        return;
    }

    System.out.println("Create an User");

    System.out.println("type exit to close program at any time");

    User userObject = new User(); // initializing user object // maybe move in while loop to enable the ability to create
    // multiple user at sequentially.


    while(true) {//menu loop for collecting user/employee info

        System.out.println("please enter a user's first name");
        String firstName = scanner.next(); // getting initial user input

        // testing user input variable firstName for input validation to see if it only contains letters. if it passes then it will
        // be passed to User class's setter method setFirstName to set the first name field.

        while (Validation.isOnlyLetters(firstName) == false) {
            System.out.println("please enter a first name using only letters");
            firstName = scanner.next();
        }

        if(Validation.isExit(firstName))//looking for exit to close the program
        {
            System.out.println("Exiting User creation. Returning to Main Menu \n");
            return;//      *******************change to return.
        }

        userObject.setFirstName(firstName);
        System.out.println(userObject.getFirstName());//for testing

        // ********************************************************************************************************

        System.out.println("Please enter the users Last name");
        String lastName = scanner.next();

        while (Validation.isOnlyLetters(lastName) == false)
        {
            System.out.println("please enter a last name using only letters");
            lastName = scanner.next();
        }

        if(Validation.isExit(lastName))//looking for exit to close the program
        {
            System.out.println("Exiting Program");
            System.exit(0);
        }

        userObject.setLastName(lastName);
        System.out.println(userObject.getLastName());//for testing

        // *****************************************************************************************************

        System.out.println("Please enter the users age");

        while(true)
        {
            // if ageInput is incorrect and throws an exception, the catch block will prompt the user to enter a
            // valid age then the continue statement will start the loop over to get user input again
            String ageInput = scanner.next();
            try {

                if (Validation.isExit(ageInput)) //need to check for "exit" to close the program.
                {
                    System.exit(0);
                }//

                userObject.setAge(Integer.parseInt(ageInput));
                System.out.println(userObject.getAge());
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
        String gender = scanner.next();
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
                gender = scanner.next();
            }

            userObject.setGender(gender);
            System.out.println(userObject.getGender());
            break;

            // ----------------------------------------------------------------------

        }//while

        //**************************************************************************************************************



        System.out.println("please enter what department the employee belongs to");
        System.out.println("Current departments: ");

        //listing current department to user so they can decide what
        //deparment they would like to add the user to
        storage.listDepartments();

        scanner.nextLine();// clearing newline from scanner obj sicne i used next() previously.

        while(true) {

            String userDepartmentChoice = scanner.nextLine();
           // boolean departmentFound = false; // this maybe bad desicn along with the if statemment
            //below using the departmentFound variable.

            /*
            looping through objectStorages's arraylist of Department objects called departmentArrayList and assigning
            it to a string. if that string matches the user input. i will then add the user object that is created
            in this class into the arrayList of user objects that belongs to every individual department object.
             */


            for (int i = 0; i < storage.departmentArrayList.size(); i++)
            {
                String dptName = storage.departmentArrayList.get(i).getDepartmentName();

                if (dptName.equalsIgnoreCase(userDepartmentChoice)) //
                {
                    storage.departmentArrayList.get(i).departmentUserList.add(userObject);//issue
                    System.out.println("user added to " + dptName);
                    return;
                }//if
            }//for

            /*
            if (departmentFound == false)
            {
                System.out.println("please enter a valid department name");
                continue;
            }
            */


            System.out.println("please enter a valid department name");
            continue;


        }// while


    }//MENU EXIT VARIABLE



}//run

}//class
