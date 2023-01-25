import java.util.ArrayList;


public class Department {
		String depName;
		ArrayList<Staff> depStaff = new ArrayList<Staff>();
        
		public Department(String depName1,ArrayList<Staff> depStaff1)
		{
			this.depName = depName1;
			this.depStaff = depStaff1;
		}
		public void addStaff(Staff staff) {
			depStaff.add(staff);
		}

		public void removeStaff(Staff staff) {
			depStaff.remove(staff);
		}
}
