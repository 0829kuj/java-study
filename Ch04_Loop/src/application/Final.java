package application;

public class Final {

	public static void main(String[] args) {
		// 변수 앞에 final이 붙으면 상수(변하지 않는 값)이 된다
		final int VALUE = 9;	// 상수의 이름은 관례상 대문자로 지정
//		VALUE = 1;	// 상수는 값을 대입할 수 없다.
		
		System.out.println(VALUE);
		
		final String USER_PASSWORD = "abc";
//		USER_PASSWORD = "ABC";
		System.out.println(USER_PASSWORD);
	}

}
