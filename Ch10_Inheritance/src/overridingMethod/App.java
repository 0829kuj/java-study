package overridingMethod;

public class App {

	public static void main(String[] args) {
		// 메소드 오버라이딩 (부모클래스에서 상속받은 같은 메소드를 덮어쓰는 개념)
		//  : 자식클래스에서 부모와 똑같은 메소드를 만듬
		// 모든 클래스의 부모클래스는 오브젝트 클래스이다
		Cat cat1 = new Cat();
		cat1.vocal();
		
		HouseCat cat2 = new HouseCat();
		cat2.vocal();
		cat2.hunt();	// 단순히 상속받은 메소드
		
		RoadCat cat3 = new RoadCat();
		cat3.vocal();
		cat3.hunt();
		
		Tiger cat4 = new Tiger();
		cat4.vocal();

	}

}
