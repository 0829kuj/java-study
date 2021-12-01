package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// A && B => A, B 모두 true일 때만 true
		boolean isRaining = false;		// 비가 오는가?
		boolean haveUmbrella = true;	// 우산을 가지고 있는가?
		boolean takeUmbrella = false;	// 우산을 쓰나?
		
		// 1번 작성법 - 다중 if문
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("첫번째 : " + takeUmbrella);
		
		// 2번 작성법 - if문에 && 연산자 사용
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("두번째 : " + takeUmbrella);
		
		// 3번 작성법 - 삼항 연산자에 && 연산자 사용
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("세번째 : "+ takeUmbrella);
	}

}
