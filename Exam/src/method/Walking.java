package method;

public class Walking {
	/*
	한 걸음을 걸을 때마다 0.02kcal가 소모된다.
	하루 동안 5000걸음을 걸었을 때, 소모된 칼로리량을 계산하는 프로그램을 작성하라.
	hint) 메소드의 리턴타입은 double이다.
	*/
	/*
	 삼겹살 1인분의 무게는 180g이고, 또 삼겹살 1g의 칼로리가 5.179이다.
	 삼겹살 3인분의 칼로리를 소수점 이할 둘째자리까지 출력하시오.
	 */
	public static void main(String[] args) {
		// 1. 칼로리 계산을 위해 메소드를 호출하시오.
		int i = 3;
		double result = calculateCalory(5000);
		double result2 = calculateCaloryPork(i);
		
		// 3. 결과를 출력하시오.
		System.out.println("5000걸음 걸었을 때 소모칼로리: " + result);
		System.out.println("삼겹살 " + i + "인분: " + result2 + " kcal");
	}
	// 2. 칼로리 계산 메소드를 정의하시오.
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
	private static double calculateCaloryPork(int cal) {
		// 삼겹살 칼로리 계산
		return 180 * 5.179 * cal;
	}
	
}
