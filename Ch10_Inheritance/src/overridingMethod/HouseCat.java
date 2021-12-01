package overridingMethod;

public class HouseCat extends Cat {
	@Override		// 어노테이션 오버라이드		
	// 메소드를 오버라이딩 했다는 표시, 이걸 써 주면 아래 오버라이딩 메소드가 부모의 메소드와 이름이 다르면 오류남
	public void vocal() {		// 부모클래스인 Cat의 vocal과 같은 메소드
		System.out.println("미야우~");
	}
}
