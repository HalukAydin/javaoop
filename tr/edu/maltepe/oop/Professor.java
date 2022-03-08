package tr.edu.maltepe.oop;

public class Professor {
    Professor p1;
    String pro_name;

    Professor(String name) {
        pro_name=name;

    }

    public void teaches() {
        System.out.println("Professor" +pro_name+ "teaches now");
    }
}
