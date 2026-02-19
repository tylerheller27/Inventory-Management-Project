import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //ArrayList<Department> departmentArrayList =  new ArrayList<>();
        //DepartmentMenu departmentMenu = new DepartmentMenu();
        ObjectStorage storage = new ObjectStorage(); // initializing in main so this persists throughout menus.
        Scanner scanner = new Scanner(System.in); // initializing in main so this persists throughout menus.
        DepartmentMenu departmentMenu = new DepartmentMenu(storage, scanner);//
        UserMenu userMenu = new UserMenu(storage, scanner);

        System.out.println("Welcome to the Employee Management System");

       while(true){

           System.out.println("        Main Menu ");
           System.out.println("type 1 to go to Department Menu");
           System.out.println("type 2 to List all Departments");
           System.out.println("type 3 to Create an Employee (NOT DEVELOPED)");

           String userInput = scanner.nextLine();

           switch(userInput)
           {
               case "1":
                   departmentMenu.run();
                   continue; //once the program returns from its submenu the main menu loop is restarted.

               case "2":
                   System.out.println("List all Departments");
                   storage.listDepartments();
                   continue;

               case "3":
                   System.out.println("Create an User");
                   userMenu.run();
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
