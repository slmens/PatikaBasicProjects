package Week5.BookSorter;

import java.util.Comparator;

public class PageOrderCompator implements Comparator<Book> {
    // This method compares two books by page number
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookPageCount() - o2.getBookPageCount();
    }
}
