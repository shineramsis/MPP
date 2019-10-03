package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	List<Building> b;
	
	public Landlord() {
		b = null;
	}
	Landlord(List<Building> b){
		this.b = b;
	}

	public static void main(String []args) {
		Apartment a1 = new Apartment(1000);
		Apartment a2 = new Apartment(2000);
		Apartment a3 = new Apartment(3000);
		Apartment a4 = new Apartment(4000);
		List<Apartment> s = new ArrayList<>();
		s.add(a1);
		s.add(a2);
		s.add(a3);
		s.add(a4);
		Building b1 = new Building(450,s);
		Landlord l = new Landlord(new ArrayList<>());
		l.b.add(b1);
		System.out.println(l.getProfit());
	}
	public double getProfit() {
		if (this.b == null)
			return 0.0;
		double profit = 0;
		for (Building b1: this.b) {
			profit += b1.getProfit();
		}
		return profit;
	}
}
