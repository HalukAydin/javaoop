package tr.edu.maltepe.oop;

import java.util.Vector;
public class main  {
    public static void main(String[] args) {
        SportsCenter sportsCenter=new SportsCenter();
        Professor professor  = new Professor("Ensar");
        Student student = new Student("Haluk");

        student.play_football();
        professor.swim();
        sportsCenter.goSportsCenter(professor);
        sportsCenter.goSportsCenter(student);
        System.out.println("SportsCenter List: ");
        sportsCenter.list_SportsCenter();
        sportsCenter.leave_fromSportsCenter(student);
        System.out.println("SportsCenter List: ");
        sportsCenter.list_SportsCenter();
        sportsCenter.leave_fromSportsCenter(professor);
        System.out.println("SportsCenter List: ");
        sportsCenter.list_SportsCenter();
    }

}









//LAB2


    /*book booka, bookb, bookc;
        Library library = new Library();

        Professor professor  = new Professor("Ensar",2022);
        Student student = new Student("Haluk",190704037);

        booka = new book("Java");
        bookb = new book("JavaScript");
        bookc = new book("Python");

        library.addBook(booka);
        library.addBook(bookb);
        library.addBook(bookc);

        System.out.println("Library:");

        library.list_Books();
        System.out.println(" ");

        library.loanBook(professor,booka);
        library.loanBook(student,bookb);

        library.loanBook(student,booka);

        library.give_Back_Book(professor,booka);
        library.loanBook(professor,bookc);

        library.loanBook(student,booka);
        library.give_Back_Book(student,bookb);


        System.out.println("Library:");
        library.list_Books();
        professor.ShowPersonBooks();
        student.ShowPersonBooks();*/




//LAB1

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








