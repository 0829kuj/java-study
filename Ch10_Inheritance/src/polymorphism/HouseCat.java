package polymorphism;

public class HouseCat extends Cat {
	@Override		// 어노테이션 오버라이드		
	public void vocal() {		// 부모클래스인 Cat의 vocal과 같은 메소드
		System.out.println("미야우~");
	}
}
