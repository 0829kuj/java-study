package application;

public class Cat {
	private String name;	// 이름
	private int id;			// 아이디(고유번호, 중복불가)
	
	// static 상수(변하지 않는 수)
	public static final String FOOD = "고양이 사료";	// final이 붙으면 변수명을 대문자로 지정한다
	// static 변수 : 객체들에 공유됨
	public static int count = 0;	// 초기값 0
	
	
	public Cat(String name) {
		this.name = name;
		count++;
		id = count;		// 객체가 만들어질때마다 카운트가 증가하면서 저장됨
	}
	
	public static int getCount() {
		// static 메소드는 일반 인스턴스(객체) 변수 사용불가
//		String s = name;	// 객체가 만들어지기 전에 이미 사용가능하므로 인스턴스 변수는 사용할 수 없다
		return count;		// static변수인 count는 사용가능
	}	

	@Override
	public String toString() {
		return "Cat [이름= " + name + ", id= " + id + "]";
	}
	
}
