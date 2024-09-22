package Service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Model.Design;
import Model.House;

public class HouseService {
	
	public static List<House> houses=new ArrayList<House>();
	private House house;
	
	static {
		Design design1=new Design("Style 1", 10);
		Design design2=new Design("Style 2", 20);
		Design design3=new Design("Style 3", 15);
	
		
		House h1=new House("A001","Taunggyi",design1,100,50000.0);
		House h2=new House("A002", "Yangon", design2, 50, 800000);
		House h3=new House("A003", "Mandalay", design3, 10, 700000);
		
		houses.add(h1);
		houses.add(h2);
		houses.add(h3);
	}
	
	public House getHouseNumber() throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    House house = null;
	    
	    do {
	        System.out.print("Enter House Number to Buy: ");
	        String houseNumber = br.readLine();
	        house = findHouseByNumber(houseNumber);
	        if (house == null) {
	            System.out.println("Please Enter correct House Number! ");
	        }
	        
	    } while (house == null);
	    
	    return house;
	}

	
	public House findHouseByNumber(String houseNumber) {
		for(House house: houses) {
			if(house.getHouseNumber().equals(houseNumber)) {
				return house;
			}
		}
		return null;
	}
	
	 
	
	public void  display() {
		for(House house: houses) {
		System.out.println("House Number: "+ house.getHouseNumber()  + " Address: "+ house.getHouseAddress() + " Design: " + house.getStyle() + " Qty: "+ house.getQty() + " Price: "+ house.getPrice());
		}
		
		
	}

}
