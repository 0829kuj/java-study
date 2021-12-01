package casting;

public class App {

	public static void main(String[] args) {
		// 캐스팅 실습
		Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
//		cat1.call();	// cat1은 Cat타입이기때문에 Cat클래스에 없는 메소드 사용불가, 사용은 안되지만 오버라이딩은 가능
		
		// HouseCat의 call메소드를 사용하기 위해 다운 캐스팅
		// 컴파일러가 에러표시를 해주지 않기 때문에 실시간 에러 발생주의
		HouseCat cat2 = (HouseCat)cat1;	// cat1이 원래 HouseCat이었기 때문에 가능
		cat2.call();		// Cat클래스에는 call메소드가 없기때문에 원래 Cat클래스인 cat1을 HouseCat으로 형변환하면 에러발생
		
		// 업 캐스팅 : 부모 타입으로 형변환 한 것
		// 다운 캐스팅 : 업 캐스팅 된 객체를 다시 다운캐스팅, 다시 자식타입으로 형변환한 것
	}

}
