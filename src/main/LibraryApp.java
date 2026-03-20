package librarymanagement.main;

import librarymanagement.model.*;
import librarymanagement.service.*;
import librarymanagement.exception.*;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        LibraryService library = new LibraryService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student Member");
            System.out.println("3. Add Faculty Member");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Books");
            System.out.println("7. Display Members");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter Book ID: ");
                        int bookId = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        library.addBook(new Book(bookId, title, author));
                        System.out.println("Book added successfully.");
                        break;

                    case 2:
                        System.out.print("Enter Member ID: ");
                        int studentId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String studentName = sc.nextLine();

                        library.addMember(new StudentMember(studentId, studentName));
                        System.out.println("Student member added.");
                        break;

                    case 3:
                        System.out.print("Enter Member ID: ");
                        int facultyId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String facultyName = sc.nextLine();

                        library.addMember(new FacultyMember(facultyId, facultyName));
                        System.out.println("Faculty member added.");
                        break;

                    case 4:
                        System.out.print("Enter Book ID: ");
                        int issueBookId = sc.nextInt();
                        System.out.print("Enter Member ID: ");
                        int issueMemberId = sc.nextInt();

                        library.issueBook(issueBookId, issueMemberId);
                        break;

                    case 5:
                        System.out.print("Enter Book ID: ");
                        int returnBookId = sc.nextInt();
                        System.out.print("Enter Member ID: ");
                        int returnMemberId = sc.nextInt();

                        library.returnBook(returnBookId, returnMemberId);
                        break;

                    case 6:
                        library.displayBooks();
                        break;

                    case 7:
                        library.displayMembers();
                        break;

                    case 8:
                        System.out.println("Exiting system...");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (BookNotFoundException |
                     MemberNotFoundException |
                     BookUnavailableException e) {

                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
