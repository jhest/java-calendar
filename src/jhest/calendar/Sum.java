package jhest.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		
//		String inputValue = scanner.nextLine();
//		String[] splitedValue = inputValue.split(" ");
//		
//		int first = Integer.parseInt(splitedValue[0]);
//		int second = Integer.parseInt(splitedValue[1]);
		
		int first = Integer.parseInt(s1);
		int second = Integer.parseInt(s2);

//		int sum = first + second;
		
		System.out.println("두 수의 합은 " + (first + second) +"입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", first, second, first + second);
		
		scanner.close();
	}

}
