
public class Country {
String countryName;
int noOfCitizens;
boolean isRoyal;
String continent;
int politicalState;
static int count = 0;
public Country() {
	this.countryName = " ";
	this.noOfCitizens =0;
	this.isRoyal = false;
	this.continent = " ";
	this.politicalState = 0;
}
public Country(String countryName, int noOfCitizens, boolean isRoyal, String continent, int politicalState) {
	this.countryName = countryName;
	this.noOfCitizens = noOfCitizens;
	this.isRoyal = isRoyal;
	this.continent = continent;
	this.politicalState = politicalState;
}
public int getState() {
return politicalState; 	
}
}
