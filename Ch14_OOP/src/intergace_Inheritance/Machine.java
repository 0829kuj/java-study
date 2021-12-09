package intergace_Inheritance;

public class Machine implements DefaultRunnable {
	@Override
	public void run() {	// DefaultRunnable 가 상속받은 Runnable 속에 있는 추상메소드라 이것도 구체화해줘야함 
		System.out.println("머신 러닝!");
		
	}
//	@Override
//	public void displayDetails() {
//		System.out.println("표시할 디테일 없음");
//	}
}
