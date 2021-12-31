package book;

public class Book {
	// 각 책마다 필요한 정보객체
	private String categoryName;
	private String bookName;
	private String writer;
	private String publisher;
	private int price;
	private int point;
	
	// 생성자
	public Book(String categoryName, String bookName, String writer, String publisher, int price, int point) {
		this.categoryName = categoryName;
		this.bookName = bookName;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.point = point;
	}

	
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}



}
