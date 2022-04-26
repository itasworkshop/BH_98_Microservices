package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//thread safe and immutable
//more operations in new API
//Local Date Time
//Zoned Date

public class TestDateTimeAPI {

	public static void main(String[] args) {
		//Date date = new Date();
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		dateTime.format(format);
		
		System.out.println(dateTime.format(format));

		System.out.println(dateTime.getMonth());
		
		System.out.println(dateTime.getDayOfWeek());
		
		System.out.println(dateTime.getSecond());
		
		LocalDate myDate = LocalDate.of(2022,5, 1);
		
		System.out.println(myDate.getDayOfWeek());
	}

}
