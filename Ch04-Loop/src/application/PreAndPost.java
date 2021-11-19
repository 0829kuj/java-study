package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연산자(++, --)의 위치에 따라 먼저 증감하고 할당(=), 할당(=)하고 증감이 결정됨
		int x = 5;
		System.out.println(x++);
		System.out.println(x);
		
		int y = 3;
		System.out.println(++y);
		
		int z = 10;
		
		int total = x + z++;	//계산을 수행한 후 z는 11이 됨
		System.out.println(total);
		
		total = x + z;
		System.out.println(total);
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		System.out.println("fruits는 : " + fruits + "개");
		
		

	}

}
