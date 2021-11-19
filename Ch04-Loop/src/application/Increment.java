package application;

public class Increment {

	public static void main(String[] args) {
		// 점수값을 1씩 증가 1씩 감소 => 반복문
		int count = 0;
		
		count = count + 1;		
		System.out.println(count);
		
		count+=1;
		System.out.println(count);
		
		count++;
		System.out.println(count);
		
		++count;
		System.out.println(count);
		
		count = count - 1;
		System.out.println(count);
		
		count-=1;
		System.out.println(count);
		
		count--;
		System.out.println(count);
		
		--count;
		System.out.println(count);

	}

}
