import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Service.PurchaseService;
import Service.SaleReportService;

public class Main {
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String menu = null;
		
		do{ System.out.println("Welcome to House selling system");
		System.out.println("1. Buy House ");
		System.out.println("2. SaleReport" );
		System.out.println("3. Exist");
		menu = br.readLine();
		switch(menu) {
		case"1":
			PurchaseService purchase=new PurchaseService();
			break;
		case "2":
			SaleReportService saleReprt=new SaleReportService();
			break;
		case "3":
			break;
		}
		}while(!menu.equals("3"));
		
		
		
	}

}
