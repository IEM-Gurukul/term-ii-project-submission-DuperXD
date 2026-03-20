package librarymanagement.model;

public class StudentMember extends Member {

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int getBorrowLimit() {
        return 3;   // Students can borrow max 3 books
    }
}
