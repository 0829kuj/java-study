package interfaces;

public class App {

	public static void main(String[] args) {
		// 인터페이스
//		Describable ds = new Describable();		// 객체를 만들 수 없다
		Describable[] objs = { new Person(), new Computer() };	// object는 모든 클래스의 부모 클래스라 주소값이 저장됨
		
		for(Describable ob : objs) {
			System.out.println(ob.getDescription());
			
			
		}

	}

}
