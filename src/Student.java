import com.sun.jdi.DoubleValue;

import java.nio.DoubleBuffer;

public class Student extends Osoba implements Comparable<Student> {
    private int godinaStudija;

    public Student(String firstName, String lastName, int age, String sex, int godinaStudija) {
        super(firstName, lastName, age, sex);
        this.godinaStudija = godinaStudija;
    }

    @Override
    public void predstavljanje() {
        super.predstavljanje();
        System.out.println("Godina studija: " + godinaStudija);

    }

    @Override
    public int compareTo(Student o) {
        return Double.valueOf(godinaStudija).compareTo(Double.valueOf(o.godinaStudija));
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam student " + getFirstName() + " " + getLastName() + " i nalazim se na " + godinaStudija + ". godini studija");

    }

    @Override
    public String toString() {
        return "Student: " + getFirstName() + " " + getLastName() +
                " (" + getAge() + " god), " + godinaStudija + ". godina studija";
    }
}