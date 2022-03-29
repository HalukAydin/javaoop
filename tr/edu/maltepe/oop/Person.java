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


    public void takeBook (book bbook){
        book.add(bbook);
    }


    public void loanbook(book lbook){
        book.remove(lbook);
    }
    public void ShowPersonBooks(){
        System.out.println("");
        System.out.println(name+" take these books :  ");
        for (int i = 0; i< book.size();i++)
        {
            System.out.println(book.get(i).getBookname());
        }
    }


}



