import java.util.ArrayList;

public class ObjectStorage {

    //ObjectStorage storage = new ObjectStorage();
    ArrayList<Department> departmentArrayList = new ArrayList<Department>();
    ArrayList<User> users = new ArrayList<User>();

    public void addDepartment(Department department)
    {
        departmentArrayList.add(department);
    }

    public void addUser(User user) { users.add(user); }



    public void listDepartments()
    {
        if(departmentArrayList.isEmpty())
        {
            System.out.println("\nThere are no departments to list \n" );
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
        if(users.isEmpty())
        {
            System.out.println("There is no department to list \n" );
        }


        for (int i = 0; i<users.size();i++)
        {
            User user = users.get(i);
            System.out.println("Users Name: " + user.getFirstName());
        }
    }





}//class object storage
