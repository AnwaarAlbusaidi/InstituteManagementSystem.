import java.util.ArrayList;

public class ComputerScienceDepartment extends Department{
    ArrayList<Student> csStudents = new  ArrayList<Student>();
    ArrayList<Course>  csCourses = new  ArrayList<Course>();
    
    public ComputerScienceDepartment(String depName1,ArrayList<Staff> depStaff1, ArrayList<Student> csStudents1,ArrayList<Course>  csCourses1)
    { 
    	super(depName1, depStaff1);
    	this.csStudents = csStudents1;
    	this.csCourses = csCourses1;
    	
    }
    public void registerStudent()
    {
    	
    }
    
    public void registerCourse()
    {
    	
    }
}
