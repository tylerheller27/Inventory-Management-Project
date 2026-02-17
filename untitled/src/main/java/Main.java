import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        ArrayList<Department> departmentArrayList =  new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

       while(true){

           System.out.println("Welcome to the Employee Management System");
           System.out.println("type 1 to Create a Department");
           System.out.println("type 2 to List all Departments");
           System.out.println("type 3 to Create an Employee");

           String userInput = scanner.next();

           switch(userInput)
           {

               case "1":
                   System.out.println("Creating a Department");
                   System.out.println("Type the name of the Department");
                   String departmentName = scanner.next();
                   Department department = new Department(departmentName);
                   departmentArrayList.add(department);



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
