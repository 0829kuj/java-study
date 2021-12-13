package application;

public class App {

	public static void main(String[] args) {
		// static 변수는 클래스명.변수 로 객체 생성없이 사용(= 객체없이 클래스명으로 바로 사용)
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI); 	// 객체를 생성할 필요없이 미리 지정되어있는 static메소드를 불러 사용
		
		System.out.println("카운트 " + Cat.count); 	// static 변수는 객체와 관계없이 클래스명을 생성하면 메모리에 올라감, 초기값인 0
		Cat cat1 = new Cat("마틸다");		// 객체를 생성할때마다 Cat메소드가 사용되면서 count값이 ++됨 
		System.out.println("카운트 " + Cat.getCount());	// static메서드는 객체를 불러오지않고 바로 클래스명으로 사용가능 
		Cat cat2 = new Cat("라이언");
		System.out.println("카운트 " + cat2.getCount());
		
		System.out.println(cat1);
		System.out.println(cat2.toString());
		
		Cat cat3 = new Cat("울버린");
		System.out.println("카운트 " + Cat.getCount());
		System.out.println(cat3.toString());
		
	}

}
