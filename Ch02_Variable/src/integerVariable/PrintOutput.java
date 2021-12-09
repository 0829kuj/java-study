package integerVariable;

public class PrintOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 + 숫자 => 문자열
		int x = 5;
		int y = 7;
		int z = x + y;
		System.out.println("x + y의 값은 = " + z);
		
		String s = "x + y의 값은 = " + z;
		System.out.println(s);
		
		double a = 3.14;
		double b = 2.16;
		//int k = a + b;
		//double형 변수끼리의 연산이기때문에 int형 변수에 지정할 수 없다
		double k = a + b;
		System.out.println(k);
	}

}
