package exception_example;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// 예외 (Exception)
		System.out.println("하나");
		Thread.sleep(2000); 	// 프로그램을 2초 대기시킴 => 예외 처리 필요  
		// ㄴ 이 예외 발생 시 throws InterruptedException으로 예외처리하겠다 
		System.out.println("둘");
	}

}
