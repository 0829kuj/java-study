package game.objects;
// 보, GameObject 상속
public class Paper extends GameObject {
	// 가위 바위 보 0 1 2 (아이디)
		public Paper() {
			setId(2);		// 아이디를 0으로, 부모클래스인 GameObject에 있는 클래스로 상속받았으므로 사용가능
			setName("보");
		}
}
