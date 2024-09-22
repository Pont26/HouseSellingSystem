package Model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Purchase> purchases;
	
	public Customer(String name) {
     this.purchases = new ArrayList<>();		
     this.name = name;
	}

	
	public void addPurchase(Purchase purchase) {
		this.purchases.add(purchase);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
	        this.name = name;
	}
	public List<Purchase> getPurchases() {
	        return purchases;
	}

	public void setPurchases(List<Purchase> purchases) {
	        this.purchases = purchases;
	}

}
