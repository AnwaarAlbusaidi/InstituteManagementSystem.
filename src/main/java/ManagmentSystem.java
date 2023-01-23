
public class ManagmentSystem {

	public static void main(String[] args) {

	}// End of main method

	public class Department {
		String depName;
        Staff staff;
		public Department(String depName,Staff staff) {
			this.depName = depName;
			this.staff = staff;
		}
	}

	class CSDepartment extends Department {

		public CSDepartment(String depName, ManagmentSystem.Staff staff) {
			super("CS Department", staff);
		}
	}

	class HRDepartment extends Department {

		public HRDepartment(String depName, ManagmentSystem.Staff staff) {
			super("HR Department", staff);
		}
	}

	public class Student {
		String studentName;
		String studentEmail;
		int studentID;

		public Student(String studentName, String studentEmail, int studentID) {
			this.studentName = studentName;
			this.studentID = studentID;
			this.studentEmail = studentEmail;
		}

	}
	public class Attendance {
		Student student;
		Course course;
		Teacher teacher;
		boolean present;

		public Attendance(Student student, Course course, Teacher teacher, boolean present) {
			this.student = student;
			this.course = course;
			this.teacher = teacher;
			this.present = present;
		}

		public void markAttendance(boolean present) {
			this.present = present;
		}

		public boolean getAttendance() {
			return this.present;
		}
	}

	public class Course {
		String courseID;
		Department Dep;

		public Course(String courseID, Department Dep) {
			this.courseID = courseID;
			this.Dep = Dep;
		}
	}

	public class Enrollment {
		private Course course;
		private Student student;
		private boolean enrollmentStatus;

		public Enrollment(Course course, Student student, boolean enrollmentStatus) {
			this.course = course;
			this.student = student;
			this.enrollmentStatus = false;
		}
	}

	public class Staff {
		String name;
		int contact;
		String email;
		
    public Staff(String stafName,int contact,String email)
    {
    	this.name = name;
    	this.contact = contact;
    	this.email = email;
    }
	}
	
	public class Teacher extends Staff {
		public Teacher(String name, int contact, String email) {
			super(name, contact, email);
		}
	}
}// End of class ManagmentSystem
