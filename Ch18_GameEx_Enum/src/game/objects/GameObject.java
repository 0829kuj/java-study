package game.objects;

public enum GameObject {
	// name, id값을 enum상수 가위, 바위, 보 값으로 대체
	// enum상수는 class의 객체처럼 사용가능
	가위, 바위, 보;		// 3개의 enum객체 생성
	
	private int[][] comparison = {
	//	나 \ 상대			  가위		바위 		보		
	/* 가위(0) */			{ 0,       -1,		-1 },
	/* 바위(1) */			{ 1,    	0,		-1 },
	/* 보 (2) */			{ -1,	    1,		 0 }
	};
	
	// 상대의 (가위, 바위, 보)와 비교하여 결과를 리턴
	public int compare(GameObject ob) {	// GameObject ob는 enum내 다른 객체를 의미
		return comparison[this.ordinal()][ob.ordinal()];	// enum내 자신의 객체와 다른 객체를 비교한 후 인덱스 번호와 비교
	}	// [this.ordinal()]에는 자신의 인덱스번호가, [ob.ordinal()]에는 다른 객체의 인덱스 번호가 들어가 둘을 배열값과 비교하면 승부결과가 나옴
	
	
	

}
