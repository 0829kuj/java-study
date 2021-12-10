package collectionsAPI;

import java.util.ArrayList;

// 연습문제 4 : 장바구니 물건 총 금액
class Cart {
	private ArrayList<Item> list;
	
	public Cart(ArrayList<Item> list) {
		this.list = list;
	}
	public void add(Item item) {
		list.add(item);
	}
	// 3. 장바구니 총합 메소드를 작성하시오
	public int totalPrice() {
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).getPrice();
		}
		return sum;
	}
}

class Item {
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}

public class TotalPrice {
	public static void main(String[] args) {
		// 1. 구매 상품 객체를 생성하시오
		ArrayList<Item> gumea = new ArrayList<>();
		gumea.add(new Item("스트라이프 셔츠", 49900));
		gumea.add(new Item("슬림 면바지", 59800));
		gumea.add(new Item("스니커즈", 46900));
		
		// 2. 장바구니에 상품을 담으시오
		Cart myCart = new Cart(gumea);
		
		// 총합 출력
		System.out.printf("총합: %d원", myCart.totalPrice());

	}

}
