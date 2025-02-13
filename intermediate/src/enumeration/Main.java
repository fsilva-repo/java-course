package enumeration;

class CurrentMounth {
	int n;

	CurrentMounth(int n) {
		this.n = n;
	}

	
	@Override
	public String toString() {
		return "Current Mounth [" + showMounth() + "]";
	}


	String showMounth() {
		String localVar = null;

		switch (this.n) {
		case 1:
			localVar = MonthOfTheYear.JANUARY.infoMounth();
			break;
		case 2:
			localVar = MonthOfTheYear.FEBRUARY.infoMounth();
			break;
		case 3:
			localVar = MonthOfTheYear.MARCH.infoMounth();
			break;
		case 4:
			localVar = MonthOfTheYear.BRIL.infoMounth();
			break;
		case 5:
			localVar = MonthOfTheYear.MAY.infoMounth();
			break;
		case 6:
			localVar = MonthOfTheYear.JUNE.infoMounth();
			break;
		case 7:
			localVar = MonthOfTheYear.JULY.infoMounth();
			break;
		case 8:
			localVar = MonthOfTheYear.AUGUST.infoMounth();
			break;
		case 9:
			localVar = MonthOfTheYear.SEPTEMBER.infoMounth();
			break;
		case 10:
			localVar = MonthOfTheYear.OCTOBER.infoMounth();
			break;
		case 11:
			localVar = MonthOfTheYear.NOVEMBER.infoMounth();
			break;
		case 12:
			localVar = MonthOfTheYear.DECEMBER.infoMounth();

		}

		return localVar;
	}
}

public class Main {
	public static void main(String[] args) {

		for (MonthOfTheYear s : MonthOfTheYear.values()) {

			System.out.println(s.infoMounth());
		}

		
		CurrentMounth cm = new CurrentMounth(2);
		System.out.println(cm);
	}
}
