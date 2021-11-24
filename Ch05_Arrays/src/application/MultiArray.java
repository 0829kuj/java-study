package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중 배열
		
		String[][] texts = {
				{"하나", "둘", "셋", "넷"},
				{"다섯", "여섯", "일곱", "여덟"},
				{"아홉", "열", "열하나", "열둘"},
		};
		
		for(int i = 0; i < texts.length; i++) {	// texts.length는 배열이 몇개인지, 여기서는 3
			String[] innerArray = texts[i];		// 
			System.out.printf("%d번쨰 배열 %s \n", i, texts[i]);
			
			for(int j = 0; j < innerArray.length; j++) {	
				System.out.printf("%s\t", innerArray[j]);
			}
			System.out.println("\n");	// 외부배열이 하나 끝날 때 마다 한 줄 띄움 
		}
		System.out.println("==========");
		
		// ver2
		for (int i = 0; i < texts.length; i++) {
			for (int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s\t", texts[i][j]);
			}
			System.out.println();
		}
	}

}
