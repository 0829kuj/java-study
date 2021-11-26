package inheritance;

public class App {
public static void main(String[] args) {
//	동물 클레스는 메소드 eat()
	animal ani = new animal();
	ani.eat();
	
	//새 클래스는 fly()
	Bird bird = new Bird();
	bird.eat(); //상속받음
	bird.fly(); 
}
}
