package tr.edu.maltepe.oop;

public class Person{
    public Person(String name, String surname, int classroom,int id){
        this.name=name;
        this.surname=surname;
        this.classroom=classroom;
        this.id=id;
    }
    private String name;
    private String surname;
    private int classroom;
    private int id;
    public int getClassroom(){
        return classroom;
    }
    public void setClassroom(){
        this.classroom=classroom;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(){
        this.surname=surname;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }

}


