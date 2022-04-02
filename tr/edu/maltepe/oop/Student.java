package tr.edu.maltepe.oop;



    public class Student extends Person implements do_sport {

    public Student(String name) {
        super(name);

    }


    @Override
    public void swim() {
        System.out.println("Student "+getName()+" go to Sportcenter for swim");
    }

        @Override
        public void play_football() {
            System.out.println("Student "+getName()+" go to Sportcenter for play football");

        }
    }
