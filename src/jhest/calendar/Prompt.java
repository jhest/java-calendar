package jhest.calendar;

import java.util.Scanner;

public class Prompt {

//	private final static String PROMPT = "cal> ";

	public void runPrompt() {

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {

			System.out.println("\n\n연도를 입력하세요(종료: -1).");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			if (year == -1) {
				break;
			}

			System.out.println("\n월을 입력하세요.");
			System.out.print("MONTH> ");
			int month = scanner.nextInt();

//			System.out.println("\n첫번째 요일을 입력하세요.");
//			System.out.print("DAY> ");
//			String dayStr = scanner.next();
//			int day = cal.parseDay(dayStr);

			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
//			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.maxDaysOfMonth(month));
			cal.printCalendar(year, month);
		}

		System.out.println("\n끝");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
