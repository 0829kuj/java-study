package aplication;

public class Dowhile {

	public static void main(String[] args) {
		//do while은 처음 한번은 조건과 상관없이 실행됨
		int count = 0;
		
		System.out.println("do while 반복문");
		
		do {
			System.out.println("카운트 :"+count);
		} while(count++ <5);
	}
	
}
