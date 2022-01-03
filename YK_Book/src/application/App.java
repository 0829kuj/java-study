package application;

import shop.MyShop;

public class App {

	public static void main(String[] args) {

		MyShop myshop = new MyShop();
		
		myshop.setTitle("영광도서"); 	// 샵 이름
		myshop.genBook(); 	// 책목록 생성
		myshop.initMenu(); // 방문 초기메뉴

	}

}

