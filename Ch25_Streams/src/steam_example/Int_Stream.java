package steam_example;

import java.util.stream.IntStream;

public class Int_Stream {

	public static void main(String[] args) {
		// 정수형 스트림 생성
		IntStream
			.range(1, 10)	// 1부터 (10-1)까지의 정수
			.skip(5)		// 5개 정수를 스킵
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		int val = IntStream.range(1, 101).sum();	// max, min, avg, count 메소드도 사용가능
			// 1부터 100까지의 정수의 합계를 리턴
		System.out.println(val);
		
		
	}

}
