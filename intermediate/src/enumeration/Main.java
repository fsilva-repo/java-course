package enumeration;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		for (MonthsOfTheYear s : MonthsOfTheYear.values()) {

			System.out.println(s.infoMounth());
		}

		System.out.println("");

		CurrentMounth cm = new CurrentMounth(Calendar.MONTH);
		System.out.println(cm);
	}
}
