package tr.edu.maltepe.oop;

import java.util.Vector;

public class Professor  extends Person implements do_sport{
    public Professor(String name) {
        super(name);

    }

    @Override
    public void swim() {
        System.out.println("Professor "+getName()+" go to Sportcenter for swim");

    }

    @Override
    public void play_football() {
        System.out.println("Professor "+getName()+" go to Sportscenter for play football");
    }




    /*public void teaches() {
        System.out.println("Professor  " + getName() + getSurname() + " teaches now in class " + getClassroom());
    }*/
}
