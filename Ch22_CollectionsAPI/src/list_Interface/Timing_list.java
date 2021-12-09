package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {
		// ArrayList와 LinkedList의 실행시간 비교
		List<Integer> arryList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		// 시간체크
		long duration = timeOperations(arryList);
		System.out.println("arrylist 측정시간 : " + duration);
		long duration2 = timeOperations(linkedList);
		System.out.println("linkedlist 측정시간 : " + duration2);
		// 일반적인 순서대로 입력은 arraylist가 2배쯤 더 빠름
		// 그러나 특정 index번호에 입력 혹은 제거할 경우 linkedlist가 훨씬 더 빠름
		
	}
	
	public static long timeOperations(List<Integer> list) {
		long start = System.currentTimeMillis();	// 시간측정
		
		for(int i = 0; i < 100000; i++) {
			list.add(i);	// 0부터 99999까지의 값을 리스트에 하나씩 입력
//			list.add(0, i);	// 0번 인덱스에 i의 값을 계속해서 갱신
		}
		
		return System.currentTimeMillis() - start;	// 실행 시간을 리턴
	}

}
