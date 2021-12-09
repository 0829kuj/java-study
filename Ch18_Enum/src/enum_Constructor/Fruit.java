package enum_Constructor;

public enum Fruit {
	APPlE("빨간색"), BANANA("노란색"), ORANGE("주황색"), MELON("초록색");	// 상수들의 집합 (인덱스 번호 0, 1, 2, 3)
	
	private String color;
	Fruit(String color) {	// enum의 생성자. class와 달리 이미 값이 상수로 생성되어 있음
		this.color = color;
	}
	
	public String toString() {
		return super.toString().toLowerCase() + " (" + color + ")";	// 상수를 소문자로, 가지고 있던 값까지 함께 출력
		// super를 이용해 enum의 toString을 호출 
	}
}
