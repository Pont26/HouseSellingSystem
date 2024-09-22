package Model;

public class Purchase {
	private Customer customer;
	private House house;
	private int qty=0;
	private double totalPrice = 0;
	
	public Purchase(Customer customer, House house,int qty) {
		this.customer = customer;
		this.house = house;
		this.qty = qty;
		this.customer.addPurchase(this);
		this.house.addPurchases(this);
		this.house.setHouseCount(this.qty);
		this.totalPrice = this.house.getPrice()*qty;
	}
	
	public int getQty() {
		return qty;
	}
	
	public House getHouse() {
		return house;
	}
	
	public double getTotalPrice() {
	   return totalPrice;
	}

}
