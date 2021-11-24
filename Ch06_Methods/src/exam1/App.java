package exam1;

public class App {

	public static void main(String[] args) {
		// 1. 메뉴 객체 만들기
		// 2. display() 메소드를 사용해서 메뉴 출력하기
		
		// 객체를 선언할때 메소드의 이름이 아니라 클래스를 가져와서 선언해야함, 메소드는 객체를 생성해야 사용가능하니 주의
		Menu menu = new Menu();
		menu.display();		// 메소드를 출력해야하므로 메소드를 호출
		
	}

}
