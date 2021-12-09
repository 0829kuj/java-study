package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 : for(초기값; 초전; 증감){명령문;}
		for(int i = 0; i <= 10; i++) {
			System.out.println("i는 " + i);
		}
		
		// 1에서 100까지의 합은
		int sum = 0;
		for(int x = 1; x <= 100; x++) {
			
			sum += x;
		}
		System.out.println("sum = " + sum);

//		for(;;) {		//무한 반복문
//			System.out.println("무한 반복문");
//		}
	}

}
