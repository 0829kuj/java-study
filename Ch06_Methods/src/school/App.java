package school;

public class App {

	public static void main(String[] args) {
		// 학생 객체를 만들기
		// 빠른 클래스 생성방법 1. 변수 2. 생성자 3. 게터세터 4. toString
		Student s1 = new Student("펭수", 7);
		Student s2 = new Student("길동", 42);
		Student s3 = new Student("라이언", 35);
		Student s4 = new Student("희동", 2);
		
		s1.setVisible(false);		// 펭수는 원격, 온도측정 안함
		
		s2.setTemperature(35.5);	// 길동은 집체, 온도 35.5

		s3.setTemperature(36.5);	// 라이언은 집체, 온도 36.5

		s4.setVisible(false);	// 희동은 원격
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
