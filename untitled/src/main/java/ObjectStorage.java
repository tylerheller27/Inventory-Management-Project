import java.util.ArrayList;

public class ObjectStorage {

    //ObjectStorage storage = new ObjectStorage();
    ArrayList<Department> departmentArrayList = new ArrayList<Department>();
    //ArrayList<User> users = new ArrayList<User>();

    public void addDepartment(Department department)
    {
        departmentArrayList.add(department);
    }

    //public void addUser(User user) { users.add(user); }



    public void listDepartments()
    {
        if(departmentArrayList.isEmpty())
        {
            System.out.println("\nThere are no departments to list \n" );
            return;
        }


        for (int i = 0; i< departmentArrayList.size(); i++)
        {
            Department department = departmentArrayList.get(i);
            System.out.println("Department Name: " + department.getDepartmentName());
        }
        System.out.println(" ");
    }


    public void listUsers()
    {
        //checking to see if a department was created since this is required to create a user
        if(departmentArrayList.isEmpty())
        {
            System.out.println("\nno employee's to list bacuase there are no deparments \n" );
        }


        //iterating through the departmentArrayList and checking if the arraylist of users called departmentUserList
        // is empty. if so then im outputting there are no users that list.
        for (int i = 0; i < departmentArrayList.size(); i++)
        {
           if(departmentArrayList.get(i).departmentUserList.isEmpty())
           {
               String dptName = departmentArrayList.get(i).getDepartmentName();
               System.out.println("no users in " + dptName);
               continue;
           }
           else{
               for (int j = 0; j<departmentArrayList.get(i).departmentUserList.size(); j++)
                    {
                   System.out.println("Users Name: " + departmentArrayList.get(i).departmentUserList.get(j).getFirstName());
                     }//for
                }//else
            System.out.println(" ");
        }//for

    }//listUsers

    public boolean isDepartmentArrayListEmpty()
    {
        if(departmentArrayList.isEmpty())
        {
            return true;
        }
        return false;
    }





}//class object storage
