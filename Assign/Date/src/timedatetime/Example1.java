package timedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(2023, 10, 20, 8, 40);
		System.out.println(localDateTime2);
		
		LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		
		LocalDateTime localDateTime4 = LocalDateTime.parse("2022-08-04T10:37:45.8");
		System.out.println(localDateTime4);
		
		LocalDate localDate = localDateTime4.toLocalDate();
		LocalTime localTime = localDateTime4.toLocalTime();
		System.out.println(localDate);
		System.out.println(localTime);
		
		// use MAx , MIN , isAfter
	}
}
