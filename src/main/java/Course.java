import java.sql.Date;
import java.util.ArrayList;


public class Course extends Event {
		ArrayList<Student> enrollStudents = new ArrayList<Student>();
		Course courseID;

		public Course(Date date, String time, Teacher teacher) {
			super(date, time, teacher);
		}
	}