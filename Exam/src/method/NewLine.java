package method;

public class NewLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line 1");
		threeLines();			// 동일 클래스 내의 메소드이므로 NewLine.threeLine(); 에서 클래스이름을 생략
		System.out.println("Line 2");
	}
	
	public static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
	}

	public static void oneLine() {
		System.out.println(">");
	}
}
