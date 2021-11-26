package Overridingmethod;

public class App {

	public static void main(String[] args) {
		// 메소드 오버라이딩
        Cat cat1 = new Cat();
        cat1.vocal();
        
        Cat cat2 = new HouseCat();
        cat2.vocal();
        cat2.hunt();
        
        Cat cat3 = new RoadCat();
        cat3.vocal();
        cat3.hunt();
        
        Cat cat4 = new Tiger();
        cat4.vocal();
	}

}
