package test;

public class StringTest {

	public static void main(String[] args) {
		// 스트링 빌더 테스트
		String text = "I ";
		text += "hava ";
		text += "a dog";
		
		System.out.println(text);
		
		StringBuilder sb1 = new StringBuilder();		// 기본적으로 java에 포함되어있어 import해줄필요없음
		
		sb1.append("I ");
		sb1.append("have ");
		sb1.append("a ");
		sb1.append("dog");
		
		System.out.println(sb1);

		String animal = "cat";
		StringBuilder sb2 = new StringBuilder("I ");
		sb2.append("hava ").append("a ").append(animal);		// .append() : 추가하기
		
		System.out.println(sb2.toString());
	}

}
