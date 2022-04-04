package tr.edu.maltepe.oop;

import java.util.Vector;

public class Person  {
    //private Vector<book> book = new Vector<book>();
    private String name;


    public Person(String name){

        this.name= name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


   /* public void takeBook (book bbook){
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
    }*/



}



