public class Journal implements BorrowableResource {

    @Override
    public void borrow(StudentBook studentBook) {
        System.out.println("Borrowing Journal: " + studentBook.getTitle() + " by " + studentBook.getFirstName() + " " + studentBook.getLastName());
    }

}