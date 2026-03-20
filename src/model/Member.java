package librarymanagement.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Member {

    protected int memberId;
    protected String name;
    protected List<Book> borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Abstract method (Abstraction)
    public abstract int getBorrowLimit();

    public boolean canBorrow() {
        return borrowedBooks.size() < getBorrowLimit();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
