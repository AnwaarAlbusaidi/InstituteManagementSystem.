import java.sql.Date;


public class Course extends Event {
		Course courseID;
        
		public Course(Date date, String time, Teacher teacher,Course courseID1) {
			super(date, time, teacher);
			this.courseID = courseID1;
		}
	}