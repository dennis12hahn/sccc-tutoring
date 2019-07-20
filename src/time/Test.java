package time;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Test {

	public static void main(String[] args) {

		LocalDateTime start = LocalDateTime.now();
		System.out.println(start.getChronology());
	}

}
