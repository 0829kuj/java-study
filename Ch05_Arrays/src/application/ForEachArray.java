package application;

public class ForEachArray {

	public static void main(String[] args) {
		// 배열에 사용할 수 있는 반복문 for each
		// 간단한 배열의 반복에는 for each문을 사용하고, index번호가 필요할 경우 for문을 사용
		String[] fruits = {"바나나", "사과", "수박"};
		int[] n = {1, 2, 3};
		boolean[] bool = {true, false, true};
		double[] d = {1.1, 2.2, 3.3, 4.4};
				
		// for each문은 ( 변수 : 배열 ), 변수의 자리에 지정한 배열의 값이 하나씩 차례로 들어가며 반복된다.
		for(String x : fruits) {
			System.out.print(x + "	");
		}
		System.out.println();
		for(int x : n) {
			System.out.print(x + "	");
		}
		System.out.println();
		for(boolean x : bool) {
			System.out.print(x + "	");
		}
		System.out.println();
		for(double x : d) {
			System.out.print(x + "	");
		}
	}

}
