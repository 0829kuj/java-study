package apllication;

public class multiArray {

	public static void main(String[] args) {
		//이중배열
	    String[][] texts = {
	    		{"하나","둘","셋"},
	    		{"넷","다섯","여섯"},
	    		{"일곱","여덟","아홉"}
	    		};
	    
		    for(int i=0; i<texts.length; i++) { //여기있는 length는 배열의 갯수가됨.
		    	//System.out.printf("%d번째 배열 %s \n",i,texts[i]);
	    	//String[] inArray= texts[i];
	    	
	    	for(int j = 0; j<texts[i].length; j++) {
	    		System.out.printf("%s \t", texts[i][j]);
	    	}
	    	
	    	System.out.println();
	    }
	
    }
}
