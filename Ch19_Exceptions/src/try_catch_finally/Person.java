package try_catch_finally;

public class Person {
	private String name;	// private 로 선언 시 바로 접근할 수 없어 메소드가 필요함 아래는 접근을 위한 메소드
	public void setName(String name) throws Exception {
		if(name == null) {
			throw new Exception("이름에 null값을 입력할 수 없습니다.");	// 예외 발생
		}
		this.name = name;
		System.out.println("이름은 " + name);
	}
}
