package standartDateHours;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GetTime {

	private ZonedDateTime time = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
	private DateTimeFormatter tzFormatter = DateTimeFormatter.ofPattern("hh:mm a VV z");
	
	public String getTime() {
		return time.format(tzFormatter);
	}
	
}
