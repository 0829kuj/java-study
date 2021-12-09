package instance_of;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID = 1L;
}
class Cat extends Creature {
	private static final long serialVersionUID = 1L;
}

public class App {
	public static void main(String[] args) {
		// 객체 instanceof 클래스 : 객체의 타입을 판별
		// a instanceof A => a가 클래스 A의 객체가 맞으면 true, 아니면 false를 반환
		Creature c1 = new Creature();
		Object c2 = c1;
		
		Cat c3 = new Cat();
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c1 instanceof Object);	// Object가 부모클래스이므로 객체가 맞음
		System.out.println(c1 instanceof Serializable);	// 인터페이스를 구현했으므로 객체맞음
		System.out.println(c1 instanceof Creature);	// 본인 클래스이므로 객체맞음
		System.out.println(c1 instanceof Cat);	// Cat은 하위클래스이므로 객체 아님
		System.out.println();
		System.out.println(c3 instanceof Object);
		System.out.println(c3 instanceof Serializable);
		System.out.println(c3 instanceof Creature);
		System.out.println(c3 instanceof Cat);
		System.out.println();
		System.out.println(c4 instanceof Object);
		System.out.println(c4 instanceof Serializable);
		System.out.println(c4 instanceof Creature);
		System.out.println(c4 instanceof Cat);
	}

}
