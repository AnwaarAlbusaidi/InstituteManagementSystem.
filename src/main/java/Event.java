import java.sql.Date;

public class Event {
		Date date;
		String time;
		Staff staff;

		public Event(Date date, String time, Staff staff2) {
			this.date = date;
			this.time = time;
			this.staff = staff2;
		}
	}
