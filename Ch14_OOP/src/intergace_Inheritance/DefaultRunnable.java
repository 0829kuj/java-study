package intergace_Inheritance;
// 인터페이스끼리 상속가능
public interface DefaultRunnable extends Runnable {	// 기본적으로 존재하는 인터페이스인 Runnable을 상속받음
	default void displayDetails() {		// 디폴트 메소드는 구현가능 
		System.out.println("표시할 디테일 없 음");
		
	};
}
