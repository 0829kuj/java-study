package interfaces;
// 인터페이스를 구현(상속) 할 때 extends가 아닌 implement사용
// 상속한 클래스에서 추상 메소드 완성(구현)
public class Person implements Describable {

	@Override
	public String getDescription() {
		return "사람 입니다.";
	}

}
