package application;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열을 생성한다.
		// int[] = {1, 2, 3}; 	초기값을 바로 넣는 방법을 리터럴이라고 함.
		int[] numbers;		// 정수형 배열 numbers 선언
		numbers = new int[3];	// new 명령어로 실제 정수형 3개 크기의 배열을 만듬
		int total = 0;
		
//		numbers[0] = 99;
//		numbers[1] = 999;
//		numbers[2] = 9999;
		
		// 3개의 수를 입력받고 
		for (int j = 0; j < 3; j++) {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("배열 인덱스 %d의 값을 입력하세요", j);
			numbers[j] = scanner.nextInt();
			
			System.out.print(numbers[j]+"	\n");	// 입력받은 값을 출력
			total = total + numbers[j];	// 모든 배열의 값을 더함
		}
			System.out.println("\n총 합계는 : " + total);	// 총합 출력
	}
}
