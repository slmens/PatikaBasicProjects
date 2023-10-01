package Week5.BookSorter;

public class Book implements Comparable<Book>{
    private String bookName,authorName;
    private int bookPageCount,publishDate;

    public Book(String bookName, String authorName, int bookPageCount, int publishDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPageCount = bookPageCount;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookPageCount() {
        return bookPageCount;
    }

    public void setBookPageCount(int bookPageCount) {
        this.bookPageCount = bookPageCount;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }


    // I sort books by A-Z in this compareTo method
    @Override
    public int compareTo(Book o) {
        return this.getBookName().charAt(0) - o.getBookName().charAt(0);
    }
}
