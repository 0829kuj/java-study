package application;

import collections.Pair;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App2 {
	public static void main(String[] args) {
	
		Pair<Integer, Cat> pair = new Pair<>(1, new Cat("마틸다"));
		
		System.out.println(pair);
		
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());
		
		Pair<Creature, Mammal> pair2 = new Pair<>(new Creature("생물"), new Mammal("포유류"));
		
		System.out.println(pair2);
		
	}

}
