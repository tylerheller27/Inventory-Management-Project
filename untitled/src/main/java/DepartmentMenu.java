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
            String userInput = scanner.nextLine();

            switch(userInput)
            {
                case "1":
                    System.out.println("Please enter the Department Name");
                    Department department =  new Department(); //creating new department object inside case 1.
                    String departmentName = scanner.nextLine();
                    department.setDepartmentName(departmentName);
                    storage.addDepartment(department);
                    storage.listDepartments();
                    continue;

                case "2":
                    System.out.println("Listing all Departments");
                    storage.listDepartments();
                    continue;



                case "exit":
                    System.out.println("Exiting Department Menu");
                    return;


                default:
                    System.out.println("invalid input");

            }// switch


        }//while menu

    }//run


}//Department Class


