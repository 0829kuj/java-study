package convertingTemp;

public class App {

	public static void main(String[] args) {
		// 섭씨온도를 화씨온도로 변환: (섭씨 * 9/5) + 32 = 화씨
		
		double c = 25;	// 섭씨온도 변수c 초기값이 25
		double f = (c * 9/5) + 32;
		System.out.println("섭씨 "+ c +"도의 " + "화씨온도는 " + f + "도 이다.");
		
	}

}
