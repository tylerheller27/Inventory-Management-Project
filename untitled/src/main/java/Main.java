import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Object initialization

        //objectStoreage is where all shared data is stored in the program.
        //storage is initialzied in Main and passed to submenus (DepartmentMenu and UserMenu)
        //so they can access and modify the same department and user data.
        ObjectStorage storage = new ObjectStorage();

        Scanner scanner = new Scanner(System.in);

        //initializing submenu objects used for creating Department and User objects
        //initialized in main to allow storage and scanner objects to be passed in
        //allowing the menu to access program data and read user input
        DepartmentMenu departmentMenu = new DepartmentMenu(storage, scanner);
        UserMenu userMenu = new UserMenu(storage, scanner);

        //******************************************MAIN MENU**********************************************//

        System.out.println("Welcome to the Employee Management System\n");

       while(true){

           System.out.println("          Main Menu ");
           System.out.println("type 1 for Department Menu");
           System.out.println("type 2 To List All Departments");
           System.out.println("type 3 To Create an employee");
           System.out.println("type 4 to List all Users/employee's\n");

           String userInput = scanner.nextLine();

           switch(userInput)
           {
               case "1":
                   departmentMenu.run();
                   continue; //restarts main menu loop

               case "2":
                   System.out.println("Listing all Departments\n");
                   storage.listDepartments();
                   continue; //restarts main menu loop

               case "3":
                   //planning on changing:
                   //instead of check if the arraylist is empty ill need to create a method to check if empty
                   //in the object storage class
                   if(storage.isDepartmentArrayListEmpty())
                   {
                       System.out.println("you need to create at least one department before creating employees!");
                       System.out.println("please create a department\n");
                       continue;
                   }
                   System.out.println("Create an User");
                   userMenu.run();
                   continue;

               case "4":
                   System.out.println("Listing all Users/employee's");
                   storage.listUsers();

                       continue;
               case "exit":
                   System.out.println("Exiting program");
                   System.exit(0);

                   System.out.println("Invalid input");
                   System.out.println("please enter a valid menu choice");
                   continue;

           }//switch

           System.out.println("programing ending");
           break;

       }//big while
        
    }//psvm

}//class
