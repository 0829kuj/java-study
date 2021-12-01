package application;

import entities.*;	// entities패키지의 모든 클래스를 import

public class App {

	public static void main(String[] args) {
		// protected 접근 지정자 사용 시 다른 패키지에서는 사용할 수 없고 상속받은 자식클래스에서는 사용가능
		
		Fruit f1 = new Apple();
//		f1.id = 7;		// 다른 패키지에서 사용불가, Apple에서 사용한 값(Apple은 자식클래스라 사용가능)을 받아와 출력하는건 가능
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}

}
