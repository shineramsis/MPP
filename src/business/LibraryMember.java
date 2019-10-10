package business;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

final public class LibraryMember extends Person implements Serializable {
	private String memberId;
	private List<CheckoutRecord> cr = new ArrayList<CheckoutRecord>();;
	
	public LibraryMember(String memberId, String fname, String lname, String tel,Address add) {
		super(fname,lname, tel, add);
		this.memberId = memberId;
	}
	
	
	public String getMemberId() {
		return memberId;
	}

	
	
	public List<CheckoutRecord> getCheckoutRecord() {
		return cr;
	}


	public void setCheckoutRecord(List<CheckoutRecord> cr) {
		this.cr = cr;
	}
	
	public void addCheckoutRecord(CheckoutRecord cr) {
		if(cr != null)
			if(getCheckoutRecord() != null)
				this.cr.add(cr);
			else {
				this.cr = new ArrayList<CheckoutRecord>(Arrays.asList(cr));
			}
	}


	@Override
	public String toString() {
		return "Member Info: " + "ID: " + memberId + ", name: " + getFirstName() + " " + getLastName() + 
				", " + getTelephone() + " " + getAddress();
	}

	private static final long serialVersionUID = -2226197306790714013L;
}
