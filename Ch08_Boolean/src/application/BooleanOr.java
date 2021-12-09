package application;

public class BooleanOr {

	public static void main(String[] args) {
		// A || B => 둘 중에 하나라도 true 이면 true
		boolean isRaining = false;		// 비가 오는가?
		boolean mightRain = true;	// 비가 올 수도 있나?
		boolean takeUmbrella = false;	// 우산을 쓰나?
		
		takeUmbrella = isRaining || mightRain;
		
		System.out.println(takeUmbrella);

	}

}
