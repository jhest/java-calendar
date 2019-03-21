package jhest.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else
			return false;
	}

	public int parseDay(String dayStr) {
		if (dayStr.equals("SU"))
			return 0;
		else if (dayStr.equals("MO"))
			return 1;
		else if (dayStr.equals("TU"))
			return 2;
		else if (dayStr.equals("WE"))
			return 3;
		else if (dayStr.equals("TH"))
			return 4;
		else if (dayStr.equals("FR"))
			return 5;
		else if (dayStr.equals("SA"))
			return 6;
		else
			return 0;
	}

	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else
			return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar(int year, int month, int day) {

		System.out.printf("\n     [%4d년%3d월]\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		for (int i = 0; i < day; i++) {
			System.out.print("   ");
		}

		int maxDay = maxDaysOfMonth(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if ((i + day) % 7 == 0) {
				System.out.println();
			}
		}
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
}
