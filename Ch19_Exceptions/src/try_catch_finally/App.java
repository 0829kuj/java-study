package try_catch_finally;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		try {
			p1.setName("펭수");	// null, "펭수" 둘 다 넣어보기
			// ㄴ null인 이 문장을 try-catch문 없이 그냥 실행 시 예외 발생, 프로그램 정상종료가 아닌 중단이 되어버림
			System.out.println("예외 발생 시 여기는 실행안됨");	// name에 null값이 들어있으면 윗문장에서 바로 catch문으로 넘어감
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {	// 여기는 예외발생과 상관없이 무조건 실행됭
			System.out.println("fianlly는 예외발생과 상관없이 무조건 실행");
		}	
		
		System.out.println("프로그램 종료");
		
	}
}
