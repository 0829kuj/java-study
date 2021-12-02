package hashcode_this;

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox();
		System.out.println(fox1);
		System.out.println(fox1.toString());	// 세 개의 주소결과가 똑같음
		System.out.println(fox1.hashCode());	// 해시코드 출력
		System.out.printf("%x \n", fox1.hashCode());	// 해시코드를 16진수로 출력
		
		Fox fox2 = fox1;	// fox2에 fox1의 주소를 넘김
		System.out.println(fox2);
		System.out.println(fox2.name); 	// Fox의 메소드를 public으로 지정해줬으므로 바로접근 가능

	}

}
