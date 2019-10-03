package Lab3;

import java.util.List;

public class Building {

double maintainance;
List<Apartment> appartment;

Building(){
	this.maintainance = 0.0;
	this.appartment = null;
}
Building(double maintainance, List<Apartment> appartment){
	this.maintainance = maintainance;
	this.appartment = appartment;
}
public double getMaintainance() {
	return maintainance;
}
public void setMaintainance(double maintainance) {
	this.maintainance = maintainance;
}
public List<Apartment> getAppartment() {
	return appartment;
}
public void setAppartment(List<Apartment> appartment) {
	this.appartment = appartment;
}
public double getProfit() {
	if (this.appartment == null)
		return 0.0;
	double profit = 0;
	double rent = 0;
	for (Apartment a1: this.appartment) {
		rent += a1.getRent();
	}
	profit = rent - this.maintainance;
	return profit;
}
}
