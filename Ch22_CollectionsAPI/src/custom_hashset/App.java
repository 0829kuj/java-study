package custom_hashset;

import java.util.HashSet;
import java.util.Objects;

class Creature {
	private int id;
	private String name;
	
	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {	// id가 같으면 같은 객체로 간주하도록 해줌
		if (this == obj)	// 객체가 같을 경우(이름뿐만 아니라 객체 자체가 같은것)
			return true;
		if (obj == null)	// 비교대상이 null값일 경우 무조건 false
			return false;
		if (getClass() != obj.getClass())	// 클래스 타입이 다를 경우 false
			return false;
		Creature other = (Creature) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Creature [ id= " + id + ", name= " + name + " ]";
	}
	
}

public class App {
	public static void main(String[] args) {
		// contains : 문자열에 문자가 포함되어 있는지 확인하는 메소드
		HashSet<Creature> creatrues = new HashSet<>();
		
		creatrues.add(new Creature(0, "고양이"));	// new가 붙으면 새로운 객체임
		creatrues.add(new Creature(1, "개"));
		creatrues.add(new Creature(2, "돼지"));
		creatrues.add(new Creature(2, "돼지"));
		creatrues.add(new Creature(3, "소"));
		creatrues.add(new Creature(4, "말"));
		creatrues.add(new Creature(4, "비둘기"));
		
		System.out.println(creatrues.contains(new Creature(0, "고양이"))); // 이 객체가 있는지 여부검사
		// new Creature(0, "고양이"))는 값은 같지만 객체가 위에 없는 다른 객체이므로 false
		// 위 Creatrue클래스에 hashset equals 메소드로 id가 같으면 같은 객체로 간주하도록 수정하고 나면 출력값이 바뀜
		creatrues.forEach(System.out::println);
		// set은 순서가 없으므로 매번 다른 순서로 출력됨

	}

}
