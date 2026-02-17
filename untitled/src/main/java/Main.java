import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //ArrayList<Department> departmentArrayList =  new ArrayList<>();
        //DepartmentMenu departmentMenu = new DepartmentMenu();
        ObjectStorage storage = new ObjectStorage(); // initializing in main so this persists throughout menus.
        Scanner scanner = new Scanner(System.in); // initializing in main so this persists throughout menus.
        DepartmentMenu departmentMenu = new DepartmentMenu(storage, scanner);//

       while(true){

           System.out.println("Welcome to the Employee Management System");
           System.out.println("type 1 to go to Department Menu");
           System.out.println("type 2 to List all Departments (NOT DEVELOPED)");
           System.out.println("type 3 to Create an Employee (NOT DEVELOPED)");

           String userInput = scanner.nextLine();

           switch(userInput)
           {

               case "1":
                   departmentMenu.run();

                   break;

               case "2":
                   System.out.println("List all Departments");
                   break;

               case "3":
                   System.out.println("Create an Employee");
                   break;

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
