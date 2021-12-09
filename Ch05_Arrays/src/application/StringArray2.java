package application;

public class StringArray2 {

	public static void main(String[] args) {
		// String은 기본 자료형이 아닌 참조 자료형으로, 참조 변수(reference variable)는 기본적으로 주소값을 가진다.
		String text = null;
		// 기본자료형(int, double 등)은 null값을 입력불가(null값은 주소가 없음)
		
		// text = new String("Hello!");		// new는 메모리에 문자열 공간을 만듬
		text = "헬로우!";		// 원래는 new로 새로 선언을 해주고 값을 넣어야 하지만 간단히 이렇게 작성해도 됨 
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];		// 배열 문자열 3칸을 실제로 생성해 tests에 주소입력
		System.out.println(texts);
		System.out.println(texts[0]);	// texts[0]에 주소값이 없어 null이 출력됨
 
		// 주소값 할당
		texts[0] = new String("안녕 안녕 !");
		texts[1] = "반가워!!";
		texts[2] = "잘 가 ~ !";
		
		for(String w : texts) {
			System.out.println(w);
		}
		
	}

}
