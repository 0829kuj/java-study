package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App {
	public static void main(String[] args) {
		Wrapper<Cat> wrap1 = new Wrapper<>();
		Wrapper<Creature> wrap2 = new Wrapper<>();
		Wrapper<Mammal> wrap3 = new Wrapper<>();
		
		Cat cat = new Cat("마틸다");
		Creature cr = new Creature("크리쳐");
		Mammal mam = new Mammal("포유류");
		
		wrap1.set(cat);
		wrap2.set(cr);
		wrap3.set(mam);
		
		Cat c1 = wrap1.get();
		Creature c2 = wrap2.get();
		Mammal m2 = wrap3.get();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m2);

	}

}
