import java.util.ArrayList;

public class Attendance {
		ArrayList<Student> students = new ArrayList<Student>();
		Course course;
		Teacher teacher;
		boolean present;

		public Attendance(ArrayList<Student> student, Course course, Teacher teacher, boolean present) {
			this.students = student;
			this.course = course;
			this.teacher = teacher;
			this.present = present;
		}

		public void markAttendance(boolean present) {
			this.present = true;
		}

		public boolean getAttendance() {
			return this.present;
		}
	}