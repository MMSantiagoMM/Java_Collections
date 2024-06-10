//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Member member1 = new Member("Santiago",123);
        Member member2 = new Member("Carlos",456);
        Member member3 = new Member("Sara",789);

        Book book1 = new Book("The mountain is you","Christi Smith","depkde");
        Book book2 = new Book("Viaje a pie","Fernando Gonzalez","depkde");
        Book book3 = new Book("The Karamazov brother","Fiodor Dostoyevski","depkde");

        Library library = new Library();

        System.out.println(library.registerMember(member1));
        System.out.println(library.addBook(book1));
        System.out.println(library.addBook(book2));
        System.out.println(library.addBook(book3));
        System.out.println(library.borrowBook(member1.getMemberId(),book1.getTitle()));
        System.out.println(library.returnListAvailableOfBooks());
        System.out.println(library.returnListBorrowedBooks(member1.getMemberId()));
        System.out.println(library.returnBook(member1.getMemberId(),book1.getTitle()));
        System.out.println(library.returnListAvailableOfBooks());
        System.out.println(library.returnBook(member1.getMemberId(),book1.getTitle()));





    }
}