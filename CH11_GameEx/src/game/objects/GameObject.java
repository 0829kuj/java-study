package game.objects;

public class GameObject {
	private int id;		// 아이디
	private String name;	// 이름
	private int[][] comparison = {
	//	나 \ 상대			  가위		바위 		보		
	/* 가위(0) */			{ 0,       -1,		-1 },
	/* 바위(1) */			{ 1,    	0,		-1 },
	/* 보(2) */			{ -1,	    1,		 0 }
	};
	
	// 상대의 (가위, 바위, 보)와 비교하여 결과를 리턴
	public int compareTo(GameObject ob) {	// compareTo메소드는 상대의 객체를 매개변수ob에 입력받음
		return comparison[id][ob.id];
	}
	
	
	protected int getId() {		// 아이디 수정은 상속한 클래스에서만 사용
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override		// 원래 object의 toString메소드는 주소값을 나타내는데 메소드 오버라이드를 해줌
	public String toString() {
		return "GameObject [id= " + id + ", name= " + name + "]";
	}
	

}
