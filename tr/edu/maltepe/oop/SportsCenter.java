package tr.edu.maltepe.oop;

import java.util.Vector;

public class SportsCenter  {
    private Vector<Person> do_sports=new Vector<Person>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goSportsCenter(Person person){
        do_sports.add(person);
        System.out.println(person.getName()+" now in the SportsCenter");
    }
    public void leave_fromSportsCenter(Person person){
        do_sports.remove(person);
        System.out.println(person.getName()+" now leave from SportsCenter");
    }
    public void list_SportsCenter () {
        for (int i = 0; i < do_sports.size(); i++) {
            Person temp = (Person) do_sports.get(i);
            System.out.println(temp.getName());
        }

    }
}

