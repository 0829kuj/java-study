package application;

public class MultiArrayEx {

	public static void main(String[] args) {
		// 이중 배열 예제. 모든 정수의 합을 구하라.
		
		int[][] values = {
				{ 1, 5, 7, 3}, 
				{ 9, 6, 3, 6}, 
				{ 2, 4, 6, 8}
			};
		int total = 0;
		
		for(int i = 0; i < values.length; i++) {	// values.length는 3임
//			System.out.println(values[i]);	// 확인용
			
			// values[i].length;는 지금 참조중인 내부배열의 길이를 출력함
			for(int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j]+"\t");
				total += values[i][j];
			}
			System.out.println();
		}
		
		System.out.println("총 합은 : " + total);

	}

}
