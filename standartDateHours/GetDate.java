package standartDateHours;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GetDate {

	private ZonedDateTime date = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
	private DateTimeFormatter tzFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy VV z");
	
	public String getDate() {
		return date.format(tzFormatter);
	}
}
