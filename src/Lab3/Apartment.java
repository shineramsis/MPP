package Lab3;

public class Apartment {
private double rent;
Apartment (){
	this.rent = 0.0;
}
Apartment (double rent){
	this.rent = rent;
}
public double getRent() {
	return rent;
}
public void setRent(double rent) {
	this.rent = rent;
}

}
