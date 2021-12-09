package method;

public class Pork {
	/*
	 삼겹살 1인분의 무게는 180g이고, 또 삼겹살 1g의 칼로리가 5.179kcal이다.
	 이를 참고하여 삼겹살 3인분의 칼로리를 소수점 이하 둘때자리까지 출력하시오.
	 */
	public static void main(String[] args) {
		// 1. 변수를 생성하시오
		// 2. 메소드를 통한 칼로리를 계산하시오
		double result = PorkCalory(3);
		
		// 3. 결과를 출력하시오
		System.out.println(result);
	}
	// 4. 칼로리 계산을 위한 메소드를 작성하시오
	private static double PorkCalory(int portion) {
		return 180 * 5.179 * portion;
	}
	
}
