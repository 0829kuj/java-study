package application.test;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// ���� �޼ҵ�
		System.out.printf("한 줄 출력합니다. %n");

		double h = 1.45;
		System.out.println("h의 값은 " + h + "입니다.");

		int dogs = 7;
		int cats = 4;

		System.out.println("1. Dogs: " + dogs);
		System.out.println("1. Cats: " + cats);

		dogs = cats;
		cats = 10;

		System.out.println("2. Dogs: " + dogs);
		System.out.println("2. Cats: " + cats);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�µ��� �Է��� �ּ��� : ");
		double celsius = scanner.nextInt();
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("���� " + celsius + "�� ȭ�� " + fahrenheit + "�̴�.");
	}

}
