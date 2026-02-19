import java.util.Scanner;

public class DepartmentMenu {

    ObjectStorage storage;
    Scanner scanner;

    public DepartmentMenu(ObjectStorage storage, Scanner scanner) //
    {
        this.storage = storage;
        this.scanner = scanner;
    }

    public void run()
    {

        while (true)
        {

            System.out.println("Press 1 to Create a Department");
            System.out.println("Press 2 to list Departments (NOT DEVELOPED)");
            System.out.println("Type exit to return to Main menu");
            String userInput = scanner.nextLine();

            switch(userInput)
            {
                case "1":
                    System.out.println("Please enter the Department Name");
                    Department department =  new Department(); //creating new department object inside case 1.
                    String departmentName = scanner.nextLine();
                    department.setDepartmentName(departmentName);
                    storage.addDepartment(department);
                    storage.listDepartments();// for testing output
                    continue;

                case "2":
                    System.out.println("Listing all Departments\n");
                    storage.listDepartments();
                    continue;



                case "exit":
                    System.out.println("Exiting Department Menu\n");
                    return;


                default:
                    System.out.println("invalid input\n");

            }// switch


        }//while menu

    }//run


}//Department Class


