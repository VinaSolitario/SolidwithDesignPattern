public class BookProcessor {
    private StudentBook studentBook;
    private BorrowableResource borrowable;

    public BookProcessor(StudentBook studentBook, BorrowableResource borrowable) {
        this.studentBook = studentBook;
        this.borrowable = borrowable;
    }

    public void process() {
        borrowable.borrow(studentBook);
    }

}