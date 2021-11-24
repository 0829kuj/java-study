package application.test;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// ï¿½ï¿½ï¿½ï¿½ ï¿½Ş¼Òµï¿½
		System.out.printf("í•œ ì¤„ ì¶œë ¥í•©ë‹ˆë‹¤. %n");

		double h = 1.45;
		System.out.println("hì˜ ê°’ì€ " + h + "ì…ë‹ˆë‹¤.");

		int dogs = 7;
		int cats = 4;

		System.out.println("1. Dogs: " + dogs);
		System.out.println("1. Cats: " + cats);

		dogs = cats;
		cats = 10;

		System.out.println("2. Dogs: " + dogs);
		System.out.println("2. Cats: " + cats);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("¿Âµµ¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä : ");
		double celsius = scanner.nextInt();
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("¼·¾¾ " + celsius + "´Â È­¾¾ " + fahrenheit + "ÀÌ´Ù.");
	}

}
