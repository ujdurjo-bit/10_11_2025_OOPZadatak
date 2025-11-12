import java.util.ArrayList;
import java.util.Collections;

public class Fakultet {
    private ArrayList<Student> Stdnt;

    public Fakultet() {
        this.Stdnt = new ArrayList<>();

    }

    public ArrayList<Student> getStdnt() {
        return Stdnt;
    }


    public static void main(String[] args) {
        Fakultet fakultet = new Fakultet();

        Student student1 = new Student("Josip", "Ujdur", 35, "M", 2);
        Student student2 = new Student("Franka", "Batelić", 19, "Ž", 1);
        Student student3 = new Student("Hrvoje", "Horvat", 23, "M", 5);

        Profesor profesor1 = new Profesor("Darko", "Darkić", 58, "M", "Likovni");
        Profesor profesor2 = new Profesor("Marija", "Marić", 64, "Ž", "Glazbeni");

/*        student1.predstavljanje();
        student1.dohvatiOpisUloge();

        student2.predstavljanje();
        student2.dohvatiOpisUloge();

        student3.predstavljanje();
        student3.dohvatiOpisUloge();

        profesor1.predstavljanje();
        profesor1.dohvatiOpisUloge();

        profesor2.predstavljanje();
        profesor2.dohvatiOpisUloge();*/


        fakultet.getStdnt().add(student1);
        fakultet.getStdnt().add(student2);
        fakultet.getStdnt().add(student3);

        //ispis prije sortiranja
        System.out.println("Prije sortiranja:   ");
        for (Student student : fakultet.getStdnt()) {
            System.out.println(student);
        }

        Collections.sort(fakultet.getStdnt());
        System.out.println("Nakon sortiranja:   ");
        //ispis poslije sortiranja
        for (Student student : fakultet.getStdnt()) {
            System.out.println(student);

        }

    }
}
