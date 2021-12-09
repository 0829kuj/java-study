package example;

public class Split_String {

	public static void main(String[] args) {
		// split() : 문자열을 쪼개 배열로 리턴
		String text1 = "As the world learns more about the Omicron coronavirus variant and Delta continues to cause Covid-19 cases to rise around much of the United States, the need for booster shots becomes clearer than ever -- even beyond the growing data about waning vaccine immunity.";
		String text2 = "오늘(9일) JTBC 확인 결과, 노 위원장은 지난 9월 6일 자신의 인스타그램에 코로나19 관련 기사 영상을 첨부한 뒤 \"데이터를 조금만 파봐도 독감과 다를 바 없다는 게 자명하지만 오늘도 우매한 국민들은 서로 손가락질하면서 마스크 착용을 종용하고 감시한다\"고 적었습니다.";
		
//		String[] words = text1.split("[^a-zA-Z]+");	// 정규 표현식 - 영문 철자를 제외한 특수문자 스페이스, ., /등을 제외하고 단어만 리턴
		String[] words = text2.split("[^가-힣]+");	// 정규 표현식 - 한글을 제외한 특수문자 스페이스, ., /등을 제외하고 단어만 리턴
		
		for(String w : words) {
			if(w.length() < 3) {	// 단어의 철자가 3자 미만인것은 제외
				continue;
			}
			System.out.println(w.toLowerCase());	// 전부 소문자로 변환하여 출력
		}

	}

}
