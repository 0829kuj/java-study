package test;

public class Test211119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===예제 1===");
		// 예제 1. 중첩 for문을 이용해 특정모양을 출력하시오
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (i == j) {
					System.out.print("\n");
				}					
			}
		}
		System.out.println("\n===예제 2===");
		// 예제 2. 중첩 for문을 이용해 *를 특정모양으로 출력하시오
		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j > 0; j--) {
				
				if (i < j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*"); 
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("\n===예제 3===");
		// 예제 3. for문을 이용해서 주어진 배열의 항목에서 최대값을 구하시오.
		int[] array3 = {1, 5, 3, 8, 2};
		int max = 0;
		
		for (int y : array3) {
			if (y >= max) {
				max = y;
			}
		}
		System.out.println("max : " + max);
		
		System.out.println("\n===예제 4===");
		// 예제 4. 중첩 for문을 이용하여 주어진 배열의 전체 항목의 합과 평균값을 구하시오.
		int[][] array4 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
		};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i = 0; i < array4.length; i++) {
			for(int j = 0; j < array4[i].length; j++) {
				System.out.print(array4[i][j]+"\t");
				sum += array4[i][j];
				count++;
			}
			System.out.println();
		}	
		avg = (double)sum / count;		// sum을 double형으로 바꿔서 연산결과도 double로 나오도록함
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		

	}

}
