package constructors;

public class Person {
	private String name;
	private double height;
	
	//public Person() {}	// 기본생성자, 생략가능하므로 특별히 만들어주지 않아도 동작함
	// 생성자 메소드 : public + 클래스명(), 리턴타입 없음
	public Person() {
		name = "익명";			// 초기값을 지정
		height = 170;			// 초기값을 지정, 입력을 받지 않아도 지정해둔 값이 나오도록
		System.out.println("한 사람을 생성!");
	}
	
	// get set 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
