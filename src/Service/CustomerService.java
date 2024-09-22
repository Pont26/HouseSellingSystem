package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Model.Customer;
import Model.House;

public class CustomerService {
	public static List<Customer> customers=new ArrayList<Customer>();

	
	public Customer getCustomer() throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter customer Name: " );
		String customerName = br.readLine();
		 Customer customer = new Customer(customerName);
		 customers.add(customer);
	    
		return customer;
		
	}

}
