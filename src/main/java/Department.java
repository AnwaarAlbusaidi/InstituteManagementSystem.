import java.util.ArrayList;


public class Department {
		String depName;
		ArrayList<Staff> depStaff = new ArrayList<Staff>();

		public void addStaff(Staff staff) {
			depStaff.add(staff);
		}

		public void removeStaff(Staff staff) {
			depStaff.remove(staff);
		}
}
