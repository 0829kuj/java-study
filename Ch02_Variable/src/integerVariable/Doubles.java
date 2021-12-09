package integerVariable;

public class Doubles {

	public static void main(String[] args) {
		// 실수 변수(소수점이 있는) 를 선언
		double h = 1.7;
		System.out.println("높이 h는 " + h + "입니다.");
		
		int i = 10;
		double d = 5.5;
		
		System.out.println(i + d);
//		System.out.println(i.getClass().getName());	//변수타입 알아보는건데 왜안됨..
		
		int value = 10 + 2 + 8;
		
		String str1 = 10 + 2 + "8";		// 숫자에 "" 안붙이면 숫자로 인식함
		System.out.println("모두 숫자값으로 연산한 value의 값: " + value);
		System.out.println("문자값으로 연산한 str1의 값: " + str1);
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		

	}

}
