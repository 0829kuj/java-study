package returnValue;

public class App {
	public static void main(String[] args) {
		// 리턴값이 있는 메소드 사용
		ReturnMethod r1 = new ReturnMethod();
		
		String cat = r1.getAnimal();		// 리턴된 값이 cat에 대입됨
		
		System.out.println("cat 변수는 : " + cat);
		
	}
}
