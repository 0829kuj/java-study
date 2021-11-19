package application;

public class ControlCheracter {

	public static void main(String[] args) {
		// 제어 문자 : \n \t
		System.out.println("==============");
		System.out.println("\t탭\t탭 만큼 띄웁니다.");
		System.out.println("==============");
		System.out.println("자바를\n배우고\n있습니다.");

		System.out.print("print는 줄을");		// print는 줄바꿈을 해주지 않음
		System.out.print("안바꾸고");
		System.out.print("출력합니다.\n");
		
		int value = 123;
		String name = "상품의 가격";
		System.out.printf("%s : %d원", name, value);
	}

}
