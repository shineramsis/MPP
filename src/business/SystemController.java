package business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import business.Book;
import dataaccess.Auth;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import dataaccess.User;

public class SystemController implements ControllerInterface {
	public static Auth currentAuth = null;

	public void login(String id, String password) throws LoginException {
		DataAccess da = new DataAccessFacade();
		HashMap<String, User> map = da.readUserMap();
		if (!map.containsKey(id)) {
			throw new LoginException("ID " + id + " not found");
		}
		String passwordFound = map.get(id).getPassword();
		if (!passwordFound.equals(password)) {
			throw new LoginException("Password incorrect");
		}
		currentAuth = map.get(id).getAuthorization();

	}

	@Override
	public List<String> allMemberIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readMemberMap().keySet());
		return retval;
	}

	@Override
	public List<String> allBookIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readBooksMap().keySet());
		return retval;
	}

	// getMember
	public static LibraryMember getMember(String memberID) {
		DataAccess da = new DataAccessFacade();
		return da.readMemberMap().get(memberID);
	}

	// getallMembers
	public static HashMap<String, LibraryMember> getAllMembers() {
		DataAccess da = new DataAccessFacade();
		return da.readMemberMap();
	}

	// find book
	public static boolean findbook(String isbn) {
		return new SystemController().allBookIds().contains(isbn);
	}

	// get book
	public static Book getBook(String isbn) {
		DataAccess da = new DataAccessFacade();
		return da.readBooksMap().get(isbn);
	}

	// Book has availablecopy
	public static boolean hasAvailableCopy(Book book) {
		for (BookCopy bc : book.getCopies())
			if (bc.isAvailable())
				return true;
		return false;
	}

	// Book has availablecopy
	public static BookCopy getAvailableCopy(Book book) {
		for (BookCopy bc : book.getCopies())
			if (bc.isAvailable())
				return bc;
		return null;
	}

	// generate memberID
	public static String createMemberID() {
		DataAccessFacade readMember = new DataAccessFacade();
		Set<String> keys = readMember.readMemberMap().keySet();
		TreeSet<String> memberIDs = new TreeSet<String>();
		memberIDs.addAll(keys);
		int newID = Integer.parseInt(memberIDs.last()) + 1;
		return newID + "";
	}

	// get all authors
	public static List<Author> allAuthors() {
		DataAccess da = new DataAccessFacade();
		List<Author> authors = new ArrayList<>();
		List<Book> books = new ArrayList<Book>(da.readBooksMap().values());
		books.forEach(book -> authors.addAll(book.getAuthors()));
		return authors;
	}

	public List<CheckoutRecord> getCheckoutRecord(String LibraryMemberId) {
		LibraryMember lm = getMember(LibraryMemberId);
		if (lm == null)
			return null;
		List<CheckoutRecord> cr = lm.getCheckoutRecord();

		return cr;
	}

	// check if record is overdue
	public boolean isOverdue(CheckoutRecord rec) {
		if (rec.getDuedate().isBefore(LocalDate.now()))
			return true;
		return false;

	}

	// get all overdue records
	public List<CheckoutRecord> OverdueRecords(String isbn) {
		HashMap<String, LibraryMember> members = getAllMembers();
		List<CheckoutRecord> cr = new ArrayList<>();
		members.forEach((id, member) -> {
			member.getCheckoutRecord().forEach(rec -> {
				if (rec.getIsbn().equals(isbn) && isOverdue(rec)) {
					Book b = getBook(isbn);
					if (!b.getCopy(rec.getCopynum()).isAvailable()) {
						cr.add(rec);
					}
				}
			});
		});

		return cr;

	}

}
