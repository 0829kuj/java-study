package inheritance;

public class App {

	public static void main(String[] args) {
		// Animal 클래스는 메소드 eat()
		Animal ani = new Animal();
		ani.eat();
		
		// Bird 클래스는 메소드 fly()
		Bird bi = new Bird();
		bi.eat();		// Bird 클래스에 eat메소드는 없음, 부모로부터 상속 받았기에 사용가능
		bi.fly();
	}

}
