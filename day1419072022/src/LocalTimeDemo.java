import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now(); 
		System.out.println(currentTime);  // will display current time eg. 15:44:44.932359900
				
		LocalTime newTimeObj = LocalTime.of(9, 45, 59); 
		System.out.println(newTimeObj); //09:45:59
				
		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(df.format(currentTime)); //will give output in specified format eg.3:44:44

	}

}
