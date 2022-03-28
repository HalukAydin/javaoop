package tr.edu.maltepe.oop;

import java.util.Vector;

public class Person {
    private Vector<book> book = new Vector<book>();
    private int id;
    private String name;


    public Person(String name, String surname, int classroom, int id){
        this.id = id;
        this.name= name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void  ShowInfo()
    {   System.out.println(" ");
        System.out.println(" ID : "+ id +" Name : "+ name);
    }

    public void borrowbook (book bbook){
        book.add(bbook);
    }

    public void ShowHaveBooks(){
        System.out.println("");
        System.out.println(name+" has borrowed these books   ");
        System.out.println("--------------------------------");
        for (int i = 0; i< book.size();i++)
        {
            System.out.println(book.get(i).getbookname());
        }
    }

    public void loanbook(book lbook){
        book.remove(lbook);
    }
}


