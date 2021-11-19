package basic;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 연습문제 1
//		String name = "홍팍";
//		int age = 35;
//		double height = 176.4;
//		boolean javaBeginner = true;
//		
//		System.out.printf("이름: %s\n나이: %d\n신장: %f\n입문자입니까? %s", name, age, height, javaBeginner);
		
		System.out.println("\n\n");

		// 연습문제 2
//		int math = 98;
//		int science = 89;
//		int eng = 76;
//		System.out.println("수학: " + math);
//		System.out.println("과학: " + science);
//		System.out.println("영어: " + eng);
//
//		System.out.println("\n\n");
//		
//		// 연습문제 3
//		double mon = 8.62;
//		double tue = 10.23;
//		double wed = 12.48;
//		double thu = 7.82;
//		double fri = 9.54;
//		double total = mon + tue + wed + thu + fri;
//		System.out.printf("월요일부터 금요일까지의 총 합은 $%.2f 입니다.", total);
//		
//		System.out.println("\n\n\n");
//		
//		// 연습문제 4
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("기본 시급을 입력해주세요: ");
//		
//		Scanner scanner2 = new Scanner(System.in);
//		System.out.println("일한 시간을 입력해주세요: ");
//		
//		int pay = scanner1.nextInt();
//		int workHour = scanner2.nextInt();
//		
//		int monthPay = pay * workHour; 
//		System.out.println(monthPay);
//		
//		System.out.println("\n\n");
//
//		// 연습문제 6
//		int inch = 32;
//		double inchToCm = 2.54;
//		double cm = inch * inchToCm;
//		System.out.println(cm + "cm");
//		
//		System.out.println("\n\n");
//		
//		// 연습문제 7
//		Scanner x = new Scanner(System.in);
//		System.out.println("x의 값을 입력하시오. ");
//		int xx = x.nextInt();
//		
//		Scanner y = new Scanner(System.in);
//		System.out.println("y의 값을 입력하시오. ");
//		int yy = y.nextInt();
//		
//		System.out.printf("곱하기: %d X %d = %d\n", xx, yy, xx * yy);
//		System.out.printf("나눈 몫: %d / %d = %d\n", xx, yy, xx / yy);
//		System.out.printf("나눈 나머지: %d %% %d = %d\n", xx, yy, xx % yy);
//		
//		System.out.println("\n\n");
//		
//		// 연습문제 8
//		int totalSec = 7582;
//		int hour = totalSec / (60 * 60);
//		int min = (totalSec % (60 * 60)) / 60;
//		int sec = totalSec % 60;
//		
//		System.out.printf("%d 초는 %d시간 %d분 %d초이다.", totalSec, hour, min, sec);
//		
//		System.out.println("\n\n");
//		
//		// 연습문제 9
//		// 속도(km/h) = 거리(km) / 시간(h)
//		double meter = 100;
//		double sec = 18;
//		double chosok = meter / sec;
//		System.out.printf("%.2fm/s\n",chosok);	//%.2f : 실수를 소수점 아래 2자리까지만 표현
//		double sisok = chosok * 3600 / 1000;
//		
//		System.out.printf("%.1fkm/h\n", sisok);
//		
//		System.out.println("\n\n");
//		
//		// 연습문제 10
//		int money = 0; 
//		money += 30000;
//		money += 20000;
//		money += 7000;
//		
//		System.out.println(money + "원");
//		
//		System.out.println("\n");
//		
//		// 연습문제 11
//		double month1 = 81.36;
//		double month2 = month1 + 0.71;
//		double month3 = month2 - 0.43;
//		double avg = (month1 + month2 + month3) / 3;
//		
//		System.out.println("1~3월까지의 평균은 " + avg + "kg입니다.");
//
//		System.out.println("\n");
//		
//		// 연습문제 12
//		int num = 374;
//		int one = num % 10 ; 	// 일의 자리 구하기
//		int two = (num % 100) / 10;	// 10의 자리 구하기
//		int three = num / 100;	// 백의 자리 구하기
//		System.out.println(one + two + three);	// 이렇게 써도
//		System.out.println((374 % 10) + ((374 % 100) / 10) + (374 / 100));	//이렇게 써도 결과는 같다. 문자열이 중간에 없기 때문.
//		
//		// 연습문제 13
//		
//		
//		System.out.println("\n");
//		
//		// 연습문제 14
		int money1 = 152365;
		
		int oman = money1 / 50000;
		int man = (money1 % 50000) / 10000;
		int ochun = (money1 % 50000) % 10000 / 5000;
		int chun = (money1 % 50000) % 10000 % 5000 / 1000;
		int totalCnt = oman + man + ochun + chun;
		int sale = money1 % 1000;
		
		System.out.printf("5만원 x" + oman);
		System.out.println("1만원 x" + man);
		System.out.println("5천원 x" + ochun);
		System.out.println("1천원 x" + chun);
		System.out.println("---------");		
		System.out.println("총 장수: " + totalCnt);	//println()으로 출력할때 변수지정안하고 바로 oman+man...으로 계산하면 문자열로 계산됨
		System.out.println("금액: " + (money1 / 1000) * 1000);
		System.out.printf("할인: %d원", sale);
		

		System.out.println("\n");
	}

}
