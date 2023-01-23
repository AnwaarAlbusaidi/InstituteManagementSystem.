import java.util.ArrayList;

public class Enrollment {
		private Course course;
		ArrayList<Student> enrollStudent = new ArrayList<Student>();
		private boolean enrollmentStatus;

		public Enrollment(Course courseID, ArrayList<Student> student, boolean enrollmentStatus) {
			this.course = courseID;
			this.enrollStudent = student;
			this.enrollmentStatus = false;
		}
		public void addStudent(Student student,Course course) {
		}

		public void removeStudent(Student student,Course course) {
		}
	}