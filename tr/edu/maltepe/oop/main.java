package tr.edu.maltepe.oop;

public class main {

    public static void main(String[] args) {

        Professor professor=new Professor("Ensar","gul",2,2020);
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





    }
}
