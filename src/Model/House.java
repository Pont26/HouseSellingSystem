package Model;

import java.util.ArrayList;
import java.util.List;

public class House {
	private String houseNumber;
	private String address;
	private Design design;
	private int qty;
	private double price;
	private int houseCount;
	private List<Purchase> purchases;
	
	public House(String houseNumber,String address, Design design,int qty,double price) {
		this.purchases = new ArrayList<>();
		this.houseNumber = houseNumber;
		this.address = address;
		this.design = design;
		this.qty = qty;
		this.price = price;
		this.design.addHouse(this);
	}
	
	public void addPurchases(Purchase purchase) {
		this.purchases.add(purchase);
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public String getHouseAddress() {
		return address;
	}
	public String getStyle() {
		return design.getStyleName();
	}

	public int getQty() {
		return qty;
	}
	
	public double getPrice() {
		return price;
	}
	public int getHosueCount() {
		return houseCount;
	}
	
	public void setHouseCount(int qty) {
		this.houseCount += qty;
	}
	public List<Purchase> getPurchases() {
	   return purchases;
	}
    public void setPurchases(List<Purchase> purchases) {
	  this.purchases = purchases;
	}
	@Override
	public String toString() {
		return ("House Number: "+this.houseNumber + " Address: "+ this.address + " Design: " + this.design.getStyleName() + " Qty: "+ this.qty + " Price: "+ this.price +"\n");
	}

}
