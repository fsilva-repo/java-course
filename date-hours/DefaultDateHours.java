package standartDateHours;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class DefaultDateHours {

	public static void main(String[] args) {
	 ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
	 
	 // Comparação
	 System.out.println(dateTime);

	 
// Formato personalizado
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss z");
   System.out.println("Formatado: " + dateTime.format(formatter));
   
   // Formato com nome do fuso horário
   DateTimeFormatter tzFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a VV");
   System.out.println("Com timezone: " + dateTime.format(tzFormatter));
	}

}
