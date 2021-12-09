package heirarchy;

public class Creature {
	//필드 변수, 인스턴스 변수
	private String name;
	//생성자(리턴 타입이 없음)
	public Creature(String name) {
		this.name = name;
	}
	//toString메소드 (객체변수 출력시 실행(생략))
	public String toString() {
		return name;
	}
	//feed메소드
	public void feed() {
		System.out.println("먹는다...");
	}
}
