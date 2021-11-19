package apllication;

public class multiArrayEx {

	public static void main(String[] args) {
		//이중 배열 예제 모든 정수의 값의 합게를 구하라.
		int[][] values = {
				{1,5,7},
				{9,6,3,10 },
				{2,4,6},
				};
		
		int total = 0;
		
//		여기에 코드 작성
       for(int i=0; i<values.length; i++) {
    	   for(int j=0; j < values[i].length; j++){
    		   total += values[i][j];
    	   }
       }

		            	    		
		System.out.println("총합은 :" + total);

	}

}
