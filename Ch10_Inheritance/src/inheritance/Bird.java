package inheritance;

// class 자식클래스 extends 부모클래스 {}	: 부모 클래스(슈퍼 클래스)를 자식클래스(서브 클래스)가 상속받게 됨
public class Bird extends Animal {		// 자식 클래스 : 부모 클래스를 상속한다
	public void fly() {
		System.out.println("하늘을 난다...");
	}
}
