public class TestProgram {
    public static void main(String[] args) {

        StudentBook stud1 = new StudentBook("15-14303-871", "Solitario", 
                                            "Vina Marie", "The Pragmatic Programmer");
        BookProcessor process1 = new BookProcessor(stud1, new Book());
        process1.process();

        StudentBook stud2 = new StudentBook("24-10796-196", "Abilong", 
                                            "Princess Deana", "Clean Code");
        BookProcessor process2 = new BookProcessor(stud2, new Journal());
        process2.process();
    }
}