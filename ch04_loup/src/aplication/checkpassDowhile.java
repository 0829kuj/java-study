package aplication;

import java.util.Scanner;

public class checkpassDowhile {
  public static void main(String[] args) {
	  final String USER_PASSWORD = "hello";
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  String password=""; //문자열 선언과 초기값을 공백(null)
	  
	  do {
		  System.out.println("비번을 입력 >");
		  password = scanner.nextLine();
		  //password 지역 변수
		  
	  }while(!password.equals(USER_PASSWORD)); //!true는false 이고 !flase는 true이다 
	 
	  scanner.close();
	  
	  System.out.println("접속 승인.");
  }
  
}
