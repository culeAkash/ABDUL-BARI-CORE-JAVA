package OopsBasics;

class Product {
	private String itemNumber;
	private String name;
	private double price;
	private long quantity;
	
	public Product(String itemNumber, String name, double price, long quantity) {
		this.itemNumber=itemNumber;
		this.name= name;
		this.price= price;
		this.quantity= quantity;
	}
	
	public Product(String itemNumber,String name, double price) {
		this.itemNumber=itemNumber;
		this.name= name;
		this.price= price;
		this.quantity=1;
	}
	
	//Getters ans Setters
	
	public void setPrice(double price) {
		if(price>0) {
			this.price=price;
		}
	}
	
	public void addItem() {
		quantity+=1;
	}
	
	public void addItem(long count) {
		if(count>=0) {
		quantity+=count;
		}
	}
	
	public double price() {
		return price;
	}
	
	public long quantity() {
		return quantity;
	}
}
