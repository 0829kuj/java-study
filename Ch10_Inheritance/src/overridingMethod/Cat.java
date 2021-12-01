package overridingMethod;
// 클래스명 뒤에 extends Object 가 생략된 것, 모든 클래스는 Object클래스를 부모로 둔다
public class Cat {		// 고양이 메소드는 vocal메소드와 hunt 메소드
	public void vocal() {
		System.out.println("야옹");
	}
	public void hunt() {
		System.out.println("사냥중~~!");
	}
}
