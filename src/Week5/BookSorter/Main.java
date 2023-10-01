package Week5.BookSorter;

import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> booksByAZ = new TreeSet<>();
        TreeSet<Book> booksByPage = new TreeSet<>(new PageOrderComparable());


        booksByAZ.add(new Book("FirstBook", "Dwayne", 50,2000));
        booksByAZ.add(new Book("SecondBook", "Jason", 500,2001));
        booksByAZ.add(new Book("ThirdBook", "Mamoa", 130,2034));
        booksByAZ.add(new Book("FourthBook", "Hanry", 46,1995));
        booksByAZ.add(new Book("Book", "Recep", 850,1954));
        booksByAZ.add(new Book("Az" , "Talha" , 432,1850));

        booksByPage.add(new Book("FirstBook", "Dwayne", 50,2000));
        booksByPage.add(new Book("SecondBook", "Jason", 500,2001));
        booksByPage.add(new Book("ThirdBook", "Mamoa", 130,2034));
        booksByPage.add(new Book("FourthBook", "Hanry", 46,1995));
        booksByPage.add(new Book("FifthBook", "Recep", 850,1954));

        for (Book book : booksByAZ){
            System.out.println(book.getBookName());
        }

        System.out.println();
        System.out.println("*******************************");
        System.out.println();

        for (Book book: booksByPage){
            System.out.println(book.getBookPageCount());
        }

    }
}
