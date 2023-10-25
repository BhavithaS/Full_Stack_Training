package date1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ExampleDate2 {
	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.parse("2023-08-14").getDayOfWeek();
		System.out.println(dayOfWeek);
		int dayOfMonth = LocalDate.parse("2002-03-08").getDayOfMonth();
		System.out.println(dayOfMonth);
		
		LocalDate thisYear = LocalDate.now();
		System.out.println(thisYear.isLeapYear());
		
		LocalDate previousDate = LocalDate.now().minusYears(3);
		System.out.println(previousDate.isLeapYear());
		
		// similar for isAfter
		Boolean before = LocalDate.parse("2023-08-02").isBefore(LocalDate.parse("2023-07-08"));
		System.out.println(before);
	}
}
