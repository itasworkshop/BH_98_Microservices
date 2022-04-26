package java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeAPIZone {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		dateTime.format(format);
		
		ZonedDateTime currentTime = ZonedDateTime.now();
		System.out.println(currentTime.format(format));
		
		ZoneId usa = ZoneId.of("America/New_York");
		ZonedDateTime newCurrentTime = currentTime.withZoneSameInstant(usa);
		
		System.out.println(newCurrentTime.format(format));

	}

}
