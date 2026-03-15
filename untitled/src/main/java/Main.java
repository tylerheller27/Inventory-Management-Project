import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //ArrayList<Department> departmentArrayList =  new ArrayList<>();
        //DepartmentMenu departmentMenu = new DepartmentMenu();

        ObjectStorage storage = new ObjectStorage(); // initializing in main so this persists throughout menus.
        Scanner scanner = new Scanner(System.in); // initializing in main so this persists throughout menus.
        DepartmentMenu departmentMenu = new DepartmentMenu(storage, scanner);//
        UserMenu userMenu = new UserMenu(storage, scanner);

        System.out.println("Welcome to the Employee Management System\n");

       while(true){

           System.out.println("          Main Menu ");
           System.out.println("type 1 to go to Department Menu");
           System.out.println("type 2 to List all Departments");
           System.out.println("type 3 Create an employee ");
           System.out.println("type 4 to List all Users/employee's\n");

           String userInput = scanner.nextLine();

           switch(userInput)
           {
               case "1":
                   // enter into the department menu
                   departmentMenu.run();
                   continue; //once the program preform it action the main menu loop is restarted.

               case "2":
                   System.out.println("Listing all Departments");
                   storage.listDepartments();
                   continue; //once the program preform it action the main menu loop is restarted.

               case "3":
                   //planning on changing:
                   //instead of check if the arraylist is empty ill need to create a method to check if empty
                   //in the object storage class
                   if(storage.departmentArrayList.isEmpty())
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
