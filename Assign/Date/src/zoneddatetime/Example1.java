package zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Asia/Kolkata");
		System.out.println(zoneId);
		
		Set<String> zoneId2 = ZoneId.getAvailableZoneIds();
		zoneId2.forEach(System.out::println);
		
		ZonedDateTime zonedDateTime =  ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(zonedDateTime);
		
	}
}
