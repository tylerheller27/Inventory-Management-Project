import java.util.ArrayList;

public class ObjectStorage {

    //ObjectStorage storage = new ObjectStorage();
    ArrayList<Department> departments = new ArrayList<Department>();
    ArrayList<User> users = new ArrayList<User>();

    public void addDepartment(Department department)
    {
        departments.add(department);
    }

    public void listDepartments()
    {
        if(departments.isEmpty())
        {
            System.out.println("There is no department to list" + "/n");
        }


        for (int i = 0; i<departments.size();i++)
        {
            Department department = departments.get(i);
            System.out.println(department.toString());
        }
    }






}//class object storage
