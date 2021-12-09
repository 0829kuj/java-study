package polymorphism;

public class App {

	public static void main(String[] args) {
		// 다형성 : 자식 클래스 타입을 부모 타입으로 형 변환
		// 집고양이 길고양이 호랑이 클래스는 모두고양이 클래스를 상속받았으므로 고양이 클래스로 선언가능
//		Cat cat1 = new Cat();	
//		Cat cat2 = new HouseCat();	// HouseCat의 객체이지만 선언은 Cat으로 되어있음
//		Cat cat3 = new RoadCat();
//		Cat cat4 = new Tiger();
//
//		Cat[] cats = { cat1, cat2, cat3, cat4 };		// Cat타입의 배열, 선언이 모두 Cat타입으로 되어있어 사용가능
//		
//		for(Cat c : cats) {		// for each 반복문 : cats배열의 각각의 객체가 c에 대입하여 반복됨, 여기서 타입은 Cat
//			c.vocal();
//			c.hunt();
//		}

		// 위(8~18행)와 방식만 다르고 동일함
		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };
		// 위처럼 선언하면 아래에 선언한 것과 동일하게 배열에 대입됨
		// cats[0] == new HouseCat();
		// cats[1] == new RoadCat();
		// cats[2] == new Tiger();
		
//		String[] s = { new String("문자열1"), new String("문자열2"), new String("문자열3") };
		// 클래스 타입으로 선언 후 객체로 바로 생성
		
		// 21번행을 출력하기 위한 코드를 for문으로 작성
		for(int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		// for each 반복문, 위의 for문과 동일함
		for(Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		// 캐스팅 형변환 (기본 데이터 타입)
		int a = (int)1.7345;		// 실수를 정수형으로 형변환, 소수점자리의 데이터는 삭제됨
		System.out.println(a);
		
		// 참조형 타입 (배열 등) : 상속관계일때 가능
		Cat cat1 = new HouseCat();		// 업 캐스팅 : 부모 타입으로 형변환 한 것
		HouseCat cat2 = (HouseCat)cat1;	// 다운 캐스팅 : 업 캐스팅 된 객체를 다시 다운캐스팅, 다시 자식타입으로 형변환한 것
		
	}

}
