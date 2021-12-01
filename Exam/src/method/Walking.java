package method;

public class Walking {
	/*
	한 걸음을 걸을 때마다 0.02kcal가 소모된다.
	하루 동안 5000걸음을 걸었을 때, 소모된 칼로리량을 계산하는 프로그램을 작성하라.
	hint) 메소드의 리턴타입은 double이다.
	*/
	public static void main(String[] args) {
		// 1. 칼로리 계산을 위해 메소드를 호출하시오.
		double result = calculateCalory(5000);
		
		// 3. 결과를 출력하시오.
		System.out.println(result);
	}
	// 2. 칼로리 계산 메소드를 정의하시오.
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
	
}
