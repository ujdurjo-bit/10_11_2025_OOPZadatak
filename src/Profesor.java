public class Profesor extends Osoba {
    private String kolegij;

    public Profesor(String firstName, String lastName, int age, String sex, String kolegij) {
        super(firstName, lastName, age, sex);
        this.kolegij = kolegij;
    }

    @Override
    public void predstavljanje() {
        super.predstavljanje();
        System.out.println("Kolegij: " + kolegij);
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam profesor " + getFirstName() + " " + getLastName() + " i nalazim se na kolegiju: " + kolegij);
    }
    @Override
    public String toString() {
        return "Profesor: " + getFirstName() + " " + getLastName() +
                " (" + getAge() + " god), Kolegij: " + kolegij;
    }
}
