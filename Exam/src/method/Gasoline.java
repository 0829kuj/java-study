package method;

public class Gasoline {
	/*
	가솔린 8.86L를 충천한 A 자동차는 182.736Km를 운행할 수 있다
	이 차의 연비를 계산하는 메소드를 완성하시오
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calcEffiency(gasoline, distance);
		
		System.out.printf("연비: %.2f km/L", efficiency);
	}
	public static double calcEffiency(double fuel, double distance) {
		
		return 0;
	}

}
