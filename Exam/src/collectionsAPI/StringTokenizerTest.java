package collectionsAPI;

import java.util.StringTokenizer;

// 연습문제 3 : 토큰문제
public class StringTokenizerTest {
	public static void main(String[] args) {
		// 입력 문자열
		String str = "치킨,피자,보쌈,족발,초밥,떡볶이,탕수육,라조기,돈까스";
		
		// 1. 구분자를 "," 로 하는 StringTokenizer를 생성하시오
		String delim = ",";	// 구분자 지정
		StringTokenizer st = new StringTokenizer(str, delim);
			// 지정한 문자열에서 구분자를 기준으로 토큰을 생성하여 저장

		// 2. 모든 토큰을 출력하시오
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}
}
