package Model;

import java.util.ArrayList;
import java.util.List;

public class Design {
	private String style;
	private int numberofWindows;
	private List<House> houses;
	
	public Design(String style,int numberOfWindows) {
		this.houses=new ArrayList<>();
		this.style = style;
		this.numberofWindows = numberOfWindows;
	}
	
	public void addHouse(House house) {
		this.houses.add(house);
	}
	
	public String getStyleName() {
		return style;
	}

}
