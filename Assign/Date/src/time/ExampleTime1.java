package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ExampleTime1 {
	public static void main(String[] args) {
		LocalTime  now = LocalTime.now();
		System.out.println(now);
		
		LocalTime time1 = LocalTime.parse("06:30");
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.of(9, 30);
		System.out.println(time2);
		
		// adding hours
		LocalTime addYear = time2.plus(2, ChronoUnit.HOURS);
		System.out.println(addYear);
		
		// same for isAfter
		boolean before = LocalTime.parse("04:30").isBefore(LocalTime.parse("10:30"));
		System.out.println(before);
		
		System.out.println(LocalTime.MIN); // similar for MAX , NOON
		
	}
}
