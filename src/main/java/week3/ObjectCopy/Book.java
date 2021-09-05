package week3.ObjectCopy;

public class Book {
    private String BookName;
    private String author;

    public Book(){

    }

    public Book(String BookName, String author){
        this.BookName = BookName;
        this.author = author;
    }

    //getter
    public String getBookName() {
        return BookName;
    }

    public String getAuthor() {
        return author;
    }

    //setter
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println("책 제목: " + BookName);
        System.out.println("저자 이름: " + author);
    }
}
