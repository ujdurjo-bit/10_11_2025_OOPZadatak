public class Student extends Osoba {
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
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam student " + getFirstName() + " " + getLastName() + " i nalazim se na " + godinaStudija + ". godini studija");
    }
}