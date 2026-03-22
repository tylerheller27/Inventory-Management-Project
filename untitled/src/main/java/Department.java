import java.util.ArrayList;

public class Department {

    //ArrayList<Department> departmentArrayList =  new ArrayList<User>();
    ArrayList<User> departmentUserList = new ArrayList<>();
    private String departmentName;
    private int numberOfEmployees;


    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void displayUserList() // developing on 3/15 ***remove when done/verified
    {
        for(int i = 0; i < departmentUserList.size(); i++)
        {
            System.out.println(departmentUserList.get(i).getFirstName());
        }
    }





    /*
    public void setNumberOfEmployees(int numberOfEmployees)
    {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }
*/






}//class
