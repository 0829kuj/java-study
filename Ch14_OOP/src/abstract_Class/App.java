package abstract_Class;

public class App {

	public static void main(String[] args) {
		// 추상 클래스
		// 추상 클래스는 객체를 만들 수 없다
		
//		GameObject obj = new GameObject();	// 객체생성불가
		GameObject[] objs = { new Player(), new Monster() };
		
		for(GameObject ob : objs) {
			System.out.println(ob);		// toString()받은게 없으므로 주소값이 출력됨
			ob.describe();		// 구현된 추상 메소드	
			// ㄴ추상 메소드로 GameObject에는 이름만 있고 자식클래스인 Monster와 Player에서 코드를 작성해줌 
		}

	}

}
