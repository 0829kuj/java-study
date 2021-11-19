package application;

public class Break {

	public static void main(String[] args) {
		// break : 반복문 안에서 사용 시 반복문을 빠져나옴
		int count = 0;
		
		while (true) {	// 무한반복
			System.out.println("헬로. " + count);
			
			if (count == 5) {
				break;		// count의 값이 5가 되면 break문에 의해 즉시 반복문을 완전히 빠져나가 Howareyou가 출력되지 않음
			}
			System.out.println("How are you");
			
			count++;	// while문이 한 번 실행될때마다 count의 값이 1씩 증가
		}
		System.out.println("Program finished");

	}

}
