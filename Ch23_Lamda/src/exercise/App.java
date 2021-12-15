package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		/* 연습문제
		 * 0 ~ 10이 아닌 값들은 모두 제거
		 * 그 다음, 각 아이템들에 +100을 한다
		 * 그 결과를 콘솔에 표시
		 */
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		// 1) 0 ~ 10이 아닌 값들은 모두 제거 
		list.removeIf(i -> (i <= 0 || i >= 10)); 	// true를 반환한 아이템을 삭제하므로 주의
		list.forEach(i -> System.out.print(i + "\t"));
		System.out.printf("\n\n");
		// 2) 각 아이템들에 + 100
		list.replaceAll(e -> e + 100);
		list.forEach(e -> System.out.print(e + "\t")); 	
	}
}
