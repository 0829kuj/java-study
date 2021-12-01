package test;

public class TernaryCondition {		// 삼항 조건 연산자

	public static void main(String[] args) {
		// 조건 ? A : B (조건이 true이면 A, 아니면 B 이다)		=> ifelse문을 한줄로 줄였다고 생각하면 편함
		System.out.println(true ? "참":"아님");
		System.out.println(false ? "참":"아님");

		int n = 15;
		n = n > 100 ? 100 : n;		// n이 100보다 크면 100을, 100보다 작으면 n의 값을 그대로 대입
		System.out.println(n);
		
		int[] values = { 6, 3, 92, 64, 17 };
		int max = 0;	// 최대값
		
		for(int val : values) {		// val에 배열 values의 원소들을 차례로 하나씩 대입함
//			if(val > max) {
//				max = val;		// val이 max값보다 크면 val값을 max에 넣는다.
//			}
			max = val > max ? val : max;	// 위의 if문을 삼항 조건 연산자로 만든것
		}
		System.out.println(max);
	}

}
