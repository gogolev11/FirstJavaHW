package fthHW;

public class Book {
    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    private String nameBook;
    private String author;
    public Book(String nameBook,String author){
        this.author=author;
        this.nameBook=nameBook;
    }

}
