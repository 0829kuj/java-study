package entities;

public class Fruit {
	protected int id;		// protected : 다른 패키지에서는 사용불가, 상속한 자식클래스에서는 사용가능

	@Override
	public String toString() {
		return "Fruit [아이디= " + id + "]";
	}
	
	
}
