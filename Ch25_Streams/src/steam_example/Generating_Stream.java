package steam_example;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {
		// 기본형: Stream<타입> 이름 = Stream.of("하나", "둘", "셋");
		// Stream.of : 스트림 객체생성
		Stream.of(1,2,3).forEach(n -> System.out.println(n));
		Stream.of("하나","둘","셋").forEach(s -> System.out.println(s));
		
		System.out.println();
		// generate메서드는 ()안의 리턴 결과로 스트림을 생성한다
		// 이때 갯수제한(limit)을 안주면 무한대로 생성함
		Stream.generate(() -> "헬로우").limit(10).forEach(s -> System.out.println(s));

	}

}
