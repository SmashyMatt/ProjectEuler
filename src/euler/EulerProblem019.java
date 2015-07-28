package euler;

import org.joda.time.DateTime;

public class EulerProblem019 {

	public static int answer() {
		new DateTime();
		DateTime dateValue = DateTime.parse("1901-01-01");
		DateTime endDate = DateTime.parse("2001-01-01");
		int sundays = 0;

		for (int i = 0; dateValue.plusDays(i).isBefore(endDate); i++) {
			if (dateValue.plusDays(i).dayOfMonth().get() == 1 && dateValue.plusDays(i).dayOfWeek().get() == 7) {
				sundays++;
			}
		}
		return sundays;
	}
}
