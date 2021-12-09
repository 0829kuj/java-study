package arrayList;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ArrayList와 LinkedList 중 택1 해도 문제없이 돌아감. 바꿀 때 상단의 import도 수정
//		ArrayList<Double> numbers = new ArrayList<>();
		LinkedList<Double> numbers = new LinkedList<>();
		double total = 0;
		while (true) {

			System.out.print("숫자 또는 'q' 입력 > ");
			String input = scanner.nextLine();
			input = input.trim(); // 공백 제거

//			System.out.println(input);
			if (input.equalsIgnoreCase("q")) { // 입력값이 대소문자 상관없이 문자 q 이면 반복문 종료(equalsIgnoreCase)
				break;
			}

			try {
				double value = Double.parseDouble(input); // 문자열 -> 실수로 변환
				numbers.add(value); // 실수로 변환된 값을 리스트에 입력
				total += value;
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
			}

		}
		scanner.close(); // 스캐너 종료
		System.out.println("~ 한 줄 띄우기 ~");
		double avg = total / numbers.size();
		if (numbers.size() > 0) {	// 입력된 숫자가 1개 이상일 경우
			System.out.println("입력된 숫자 : ");
			for (Double num : numbers) {
				System.out.printf("%.2f\n", num);
			}
			System.out.println("총합: " + total + ", 평균: " + avg);
		} else {
			System.out.println("숫자가 입력되지 않았습니다");
		}

	}

}
