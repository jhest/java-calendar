package jhest.calendar;

import java.util.Scanner;
import java.util.Calendar;

public class MaxDay {

	public static void main(String[] args) {

		System.out.println("달을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d까지 있습니다.", month, maxDays[month-1]);
		
		
		
	}

}
