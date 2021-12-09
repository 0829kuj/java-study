package hello;	// 패키지 헬로우

public class App {	// 클래스 App 만들기

	public static void main(String[] args) {
		// 메인 메소드에서 프로그램 시작
		// 주석 단축키 CTRL + /
		System.out.println("hello world!~@!");
		// 실행방법 이클상단 ▶, 오른쪽 마우스 Run as 자바 애플리케이션
		// 왼쪽 클래스파일을 선택하고 ▶ 오른쪽 마우스 Run as 자바 애플리케이션
		// 단축기 : CTRL + F11
		int x = 10;
		int y = 20;
		System.out.println("hello world!!  " + x + 10);
		System.out.println("hello world!!  " + (x + y));
		
		
		int age = 25;
		String addr = "부산";
		
		System.out.printf("줄바꿈 기능");
		System.out.printf("없음.");
		
		System.out.printf("줄바꾸기 %n");
		System.out.printf("성공!%n");
		System.out.printf("내 나이는 %d살 입니다.", age);
		System.out.printf("내 나이는 %d살이고 %s에 살고 있습니다.%n", age, addr);
		
		System.out.println("~~~한 줄 띄우기~~~");
		
		String name = "홍길동";
		int age2 = 35;
		int math = 96;
		int eng = 76;
		System.out.printf("이름: " + name +" 나이: " + age2 + "세%n");
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		
	}

}
