package date1;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class ExampleDate1 {
	public static void main(String[] args) {
		// printing today's date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);
		
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		LocalDate localDate3 = LocalDate.now(zone);
		System.out.println(localDate3);
		
		LocalDate localDate4 = LocalDate.of(2023,10,15);
		System.out.println(localDate4);
		
		LocalDate localDate5 = LocalDate.parse("2022-10-10");
		System.out.println(localDate5);
		
		LocalDate localDate6 = localDate5.plusDays(2);
		System.out.println(localDate6);
		
		LocalDate localDate7 = localDate6.minusDays(5);
		System.out.println(localDate7);
	}
}
