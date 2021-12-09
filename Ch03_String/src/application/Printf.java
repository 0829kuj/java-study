package application;

public class Printf {

	public static void main(String[] args) {
		// printf 출력
		int age = 25;
		String addr = "부산";
		
		System.out.printf("내 나이는 %d살 이고, 고향은 %s 입니다.", age, addr);
		
		double pi = 3.141592;
		System.out.printf("파이의 값은 %f 입니다.", pi);	//printf는 줄띄움 없음

	}

}
