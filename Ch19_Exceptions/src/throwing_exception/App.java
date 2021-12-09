package throwing_exception;

public class App {

	public static void main(String[] args) throws Exception {
		// throw 예외처리
		Thermostat stat = new Thermostat();
		
		stat.setTemperature(40);
	}

}
