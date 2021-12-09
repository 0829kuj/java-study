package custom_exception.exceptions;
// Exception을 상속받아 새 예외클래스를 만든다.
public class TempOutOfRangeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TempOutOfRangeException(String message) {	// 입력된 메세지로 새 예외 객체 생성
		super(message);		
		// message를 상위 클래스인 Exception으로 리턴함
		// Exception는 원래 예외를 생성하는 기능이 있음. 고로 상속받아 message를 넘겨줌으로써 새로운 예외를 만들어준 것.
	}

}
