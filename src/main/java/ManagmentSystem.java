import java.sql.Date;
import java.util.ArrayList;

public class ManagmentSystem {

	public static void main(String[] args) {

	}// End of main method

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

	class CSDepartment extends Department {
	}

	class HRDepartment extends Department {

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

	public class Enrollment {
		private Course course;
		ArrayList<Student> enrollStudent = new ArrayList<Student>();
		private boolean enrollmentStatus;

		public Enrollment(Course course, ArrayList<Student> student, boolean enrollmentStatus) {
			this.course = course;
			this.enrollStudent = student ;
			this.enrollmentStatus = false;
		}
		 public boolean getEnrollmentStatus() {
		        return this.enrollmentStatus;
		    }
		    public void setEnrollmentStatus(boolean status) {
		        this.enrollmentStatus = status;
		    }
		    public void addStudent(Student student) {
		        enrollStudent.add(student);
		    }
		    
		    public void removeStudent(Student student) {
		        enrollStudent.remove(student);
		    }
	}

	public class Staff {
		String name;
		int contact;
		String email;

		public Staff(String stafName, int contact, String email) {
			this.name = stafName;
			this.contact = contact;
			this.email = email;
		}
	}

	public class Teacher extends Staff {
		public Teacher(String name, int contact, String email) {
			super(name, contact, email);
		}
	}

	public class Event {
		Date date;
		String time;
		Teacher teacher;

		public Event(Date date, String time, Teacher teacher) {
			this.date = date;
			this.time = time;
			this.teacher = teacher;
		}
	}

	public class Course extends Event {
		ArrayList<Student> enrollStudents = new ArrayList<Student>();
		Course courseID;

		public Course(Date date, String time, ManagmentSystem.Teacher teacher) {
			super(date, time, teacher);
		}
	}

	public class WorkShop extends Event {

		public WorkShop(Date date, String time, ManagmentSystem.Teacher teacher) {
			super(date, time, teacher);
		}
	}

}// End of class ManagmentSystem
