package business;

import java.io.Serializable;
import java.time.LocalDate;

public class CheckoutRecord implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4341858268173253319L;
	private String isbn;
	private int copynum;
	private LocalDate checkoutdate, duedate;
	
	public CheckoutRecord(String isbn, int copynum, LocalDate checkoutdate, LocalDate duedate) {
		super();
		this.isbn = isbn;
		this.copynum = copynum;
		this.checkoutdate = checkoutdate;
		this.duedate = duedate;
	}

	@Override
	public String toString() {
		
		return "[ISBN: "+isbn +" copyNumber: "+copynum+ " CheckoutDate: "+ checkoutdate+" DueDate: "+duedate +"]";
	}

	public String getIsbn() {
		return isbn;
	}

	public int getCopynum() {
		return copynum;
	}

	public LocalDate getCheckoutdate() {
		return checkoutdate;
	}

	public LocalDate getDuedate() {
		return duedate;
	}
	
	
	
}
