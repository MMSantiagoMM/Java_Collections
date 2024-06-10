import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;

    private Integer memberId;

    private List<Book> borrowedBook;

    public Member() {
    }

    public Member(String name, Integer memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public List<Book> getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(List<Book> borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public String borrowBook(Book book){
        setBorrowedBook(List.of(book));
        return "You borrowed a book successfully";
    }




}
