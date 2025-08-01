package standartDateHours;

public class PrintDateTime {

	public static void main(String[] args) {
	
		GetTime time = new GetTime();
		System.out.println(time.getTime());
		
		System.out.println("\n");

		GetDate date = new GetDate();
		System.out.println(date.getDate());

	}

}
