package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Customer;
import Model.House;
import Model.Purchase;

public class PurchaseService {
	private HouseService houseService;
	private CustomerService customerService;
	public PurchaseService() throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		houseService=new HouseService();
		customerService=new CustomerService();
	    doPurchase();
		
	}
	public Purchase doPurchase() throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String flag=null;
	    String add=null;
		
          do {
               Customer customer = customerService.getCustomer();
                  do {
                          houseService.display();
                          House house = houseService.getHouseNumber();
                           System.out.print("How many houses would you like to purchase: ");
                           int qty = Integer.parseInt(br.readLine());
                           Purchase purchase = new Purchase(customer, house, qty);
                           System.out.print("Do you want to purchase more houses yes/no: ");
                            flag = br.readLine();
                     } while (flag.equals("yes"));
                  
          System.out.print("Do you want to add another customer yes/no: ");
          add = br.readLine();
    
       } while (add.equalsIgnoreCase("yes"));
		return null;
}
}
