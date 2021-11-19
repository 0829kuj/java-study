package apllication;

public class stringArray {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		
		String[] animals = {"고양이","개","펭귄","사자"};
		
		System.out.println(animals[0]); //고양이
		System.out.println(animals[1]); //개 
		System.out.println(animals[2]); //펭귄
		System.out.println(animals[3]); //사자
		//System.out.println(animals[4]); //범위안에 없으므로 오류
		
		//배열안의 값을 바꾸는 방법
		animals[0] = "닭";
		System.out.println(animals[0]); //닭
		System.out.println(animals[1]); //개
		System.out.println(animals[2]); //펭귄
		System.out.println(animals[3]); //사자
		

	}

}
