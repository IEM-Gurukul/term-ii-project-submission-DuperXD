package librarymanagement.service;

import librarymanagement.model.*;
import librarymanagement.exception.*;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {

    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer, Member> members = new HashMap<>();

    // Add Book
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    // Add Member
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    // Issue Book
    public void issueBook(int bookId, int memberId)
            throws BookNotFoundException,
            MemberNotFoundException,
            BookUnavailableException {

        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if (book == null) {
            throw new BookNotFoundException("Book not found.");
        }

        if (member == null) {
            throw new MemberNotFoundException("Member not found.");
        }

        if (!book.isAvailable()) {
            throw new BookUnavailableException("Book already issued.");
        }

        if (!member.canBorrow()) {
            throw new BookUnavailableException("Borrow limit reached.");
        }

        book.issueBook();
        member.borrowBook(book);

        System.out.println("Book issued successfully to " + member.getName());
    }

    // Return Book
    public void returnBook(int bookId, int memberId)
            throws BookNotFoundException,
            MemberNotFoundException {

        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if (book == null) {
            throw new BookNotFoundException("Book not found.");
        }

        if (member == null) {
            throw new MemberNotFoundException("Member not found.");
        }

        book.returnBook();
        member.returnBook(book);

        System.out.println("Book returned successfully.");
    }

    // Display all books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    // Display all members
    public void displayMembers() {

        if (members.isEmpty()) {
            System.out.println("No members registered in the library.");
            return;
        }

        for (Member member : members.values()) {
            System.out.println(member.getMemberId() + " | "
                    + member.getName()
                    + " | Borrowed Books: "
                    + member.getBorrowedBooks().size());
        }
    }
}
