package windowProgramming;

public class App {

	public static void main(String[] args) {
		// 윈도우 객체를 생성
		// set메소드로 값을 입력하고 get메소드로 값을 출력하라
		// 설정 윈도우창의 가로길이 300, 세로길이 300
		// 현재 보이도록 true, top 200, left 400
		
		Window w1 = new Window();
		w1.setWidth(300);
		w1.setHeight(300);
		w1.setIsVisible(true);
		w1.setTop(200);
		w1.setLeft(400);
		
		System.out.println(w1.getWidth());
		System.out.println(w1.getHeight());
		System.out.println(w1.getIsVisible());
		System.out.println(w1.getTop());
		System.out.println(w1.getLeft());

	}

}
