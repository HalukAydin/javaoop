package tr.edu.maltepe.oop;

public class Professor extends Person{


     public Professor(String name,String surname,int classroom,int id) {
        super(name,surname,classroom,id);
    }

    public void teaches() {
        System.out.println("Professor  " + getName() + getSurname() + " teaches now in class " + getClassroom());
    }
}
