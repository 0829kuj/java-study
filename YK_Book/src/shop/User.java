package shop;

public class User {
	private String id;
	private String pwd;
	private int savePoint;
	private int customer_id;
	private static int count = 0;
	
	public User(String id, String pwd, int savePoint) {
		this.id = id;
		this.pwd = pwd;
		this.savePoint = savePoint;
		count++;
		customer_id = count;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getSavePoint() {
		return savePoint;
	}

	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		User.count = count;
	}


	@Override
	public String toString() {
		return "#  아이디= " + id + ", 적립금= " + savePoint + " \n";
	}
	
}

