import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    private List<Member> members = new ArrayList<>();

    public Library() {
    }

    public Library(List<Book> books, List<Member> members) {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public String addBook(Book book){
        books.add(book);
        return "a book was added";
    }

    public String registerMember(Member member){
        members.add(member);
        return "A new member was added";
    }

    public String borrowBook(Integer memberId, String bookName){
        for (Member member: members){
            if(member.getMemberId().equals(memberId)){
                for (Book book:books){
                    if(book.getTitle().contains(bookName)){
                        List<Book>bookList = new ArrayList<>();
                        bookList.add(book);
                        member.setBorrowedBook(bookList);
                        books.remove(book);
                        return "A book was borrowed";
                    }
                }
            }
        }
        return "Something went wrong with user or book";
    }

    public String returnBook(Integer memberId, String bookName){
        for (int i = 0; i < members.size(); i++)
            if(members.get(i).getMemberId().equals(memberId)){
                if(members.get(i).getBorrowedBook().isEmpty()){
                    return "This user doesn't have borrowed books";
                }else{
                    if(members.get(i).getBorrowedBook().get(i).getTitle().contains(bookName)){
                        books.add(members.get(i).getBorrowedBook().get(i));
                        members.get(i).getBorrowedBook().remove(members.get(i).getBorrowedBook().get(i));
                        return "A book was returned";
                    }
                }
            }
        return "No book was returned";
    }

    public List<Book> returnListAvailableOfBooks(){
        return books;
    }

    public List<Book> returnListBorrowedBooks(Integer memberId){
        for (Member member: members){
            if(member.getMemberId().equals(memberId)){
                return member.getBorrowedBook();
            }
        }
        return null;
    }





}
