package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Customer;
import Model.House;
import Model.Purchase;

public class SaleReportService {
	private HouseService houseService;
	private CustomerService customerService;
	
	
	public SaleReportService() throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		houseService = new HouseService();
		customerService=new CustomerService();
	
		String menu=null;
		System.out.println("Choose Menu: ");
		System.out.println("1. Over All sale report");
		System.out.println("2. Sale report by all customer");
		System.out.println("3. Find Sale Report by House Number");
		System.out.print("4. Exist");
		System.out.print("Choose number: ");
		menu = br.readLine();
		
		switch(menu) {
		case "1" :
			overAllSaleReport();
			break;
		case "2" :
			SaleReportyByAllCustomer();
			break;
		case "3" :
			
			SaleReportByIndividualHouseNumber();
		case"4" :
			break;
		
		}

	}
	
	public void overAllSaleReport() {
		for(House house: HouseService.houses) {
			System.out.println ("House Number: "+house.getHouseAddress()+ "| Address: "+ house.getHouseAddress() + "| Design: " + house.getStyle() + "| Qty: "+ house.getHosueCount()+ "| Price: "+ house.getPrice() +"| Total Price:" +(house.getPrice()*house.getHosueCount())+"\n");

		}
	}
	
	public void SaleReportyByAllCustomer() {
		for(Customer customer: CustomerService.customers) {
			System.out.println("Customer Name: "+ customer.getName());
			for(Purchase purchase: customer.getPurchases()) {
				System.out.println("House Number "+ purchase.getHouse().getHouseNumber()+ "| Total pruchase count: "+ purchase.getQty() + "| Total Price: "+ purchase.getTotalPrice() );
			}
		}
	}
	
    public void SaleReportByIndividualHouseNumber() throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter House Number for sale report: ");
        String houseNumber=br.readLine();
        House house= houseService.findHouseByNumber(houseNumber);
        System.out.println("House Number: "+ house.getHouseNumber());
        for(Purchase purchase: house.getPurchases()){
            System.out.println("House Address: "+purchase.getHouse().getHouseAddress()+"| TotalPurchaseCount: "+purchase.getQty()+"| TotalPrice: "+purchase.getTotalPrice());
        }

     }

}
