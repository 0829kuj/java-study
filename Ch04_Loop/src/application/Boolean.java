package application;

public class Boolean {

	public static void main(String[] args) {
		// boolean 타입은 참, 거짓(true, false)
		boolean con1 = false;
		System.out.println("조건1: " + con1);
		
		boolean con2 = 4 < 5;
		System.out.println("조건2: " + con2);
		
		boolean con3 = 2 > 8;
		System.out.println("조건3: " + con3);
		
		boolean con4 = 9 == 10;
		System.out.println("조건4: " + con4);
		System.out.printf("조건4: %b\n", con4);		//%b 가 boolean값
		
		boolean con5 = 1 != 2;	// 1과 2는 같지않으므로 true
		System.out.println("조건5: " + con5);
		

	}

}
