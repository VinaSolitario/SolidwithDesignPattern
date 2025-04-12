public class Book implements BorrowableResource {

    @Override
    public void borrow(StudentBook studentBook) {
        System.out.println("Borrowing Book: " + studentBook.getTitle() + " by " + studentBook.getFirstName() + " " + studentBook.getLastName());
    }

}