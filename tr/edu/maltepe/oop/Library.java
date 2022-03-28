package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library {
    private Vector books;
    public Library(){
        books =new Vector();
    }
    public void addBook (book abook){
        books.add(abook);
    }

    public void removeBook(book rbook){
        books.remove(rbook);
    }

    public void list_books (){
        for (int i=0; i< books.size();i++ ){
            book temp = (book) books.get(i);
            System.out.println(temp.getbookname());
        }
    }

    public void loanbook(Person person, book book){
        if (books.contains(book))
        {
            person.borrowbook(book);
            removeBook(book);
            System.out.println(person.getName()+ " take the " +book.getbookname()+ " book");
            System.out.println(" ");

        }
        else{
            System.out.println(book.getbookname()+ " is not in the library now.");
            System.out.println(" ");
        }
    }
    public void give_Back_Book(Person person, book book){
        person.loanbook(book);
        addBook(book);
        System.out.println( person.getName()+ " left the " + book.getbookname()+" book to library.");
        System.out.println(" ");
    }
}


