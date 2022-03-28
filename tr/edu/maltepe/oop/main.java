package tr.edu.maltepe.oop;

import java.util.Vector;
public class main {
    public static void main(String[] args) {
        book book1, book2, book3;
        Library library = new Library();

        Professor professor  = new Professor("Ensar","GUL",2,2022);
        Student student = new Student("Haluk","AYDIN",2,190704037);

        book1 = new book("Java");
        book2 = new book("JavaScript");
        book3 = new book("Python");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Library:");

        library.list_books();
        System.out.println(" ");

        library.loanbook(professor,book1);
        library.loanbook(student,book2);

        library.loanbook(student,book1);

        library.give_Back_Book(professor,book1);
        library.loanbook(professor,book3);

        library.loanbook(student,book1);
        library.give_Back_Book(student,book2);


        System.out.println("Library:");
        library.list_books();
        professor.ShowHaveBooks();
        student.ShowHaveBooks();
    }

}










        /*Professor professor=new Professor("Ensar","gul",2,2020);
        Student student=new Student("Haluk","Aydın",2,190704037);

        System.out.println(professor.getName());
        System.out.println(professor.getSurname());
        System.out.println(professor.getClassroom());
        System.out.println(professor.getId());

        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getClassroom());
        System.out.println(student.getId());

        professor.teaches();
*/








