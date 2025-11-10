public class Fakultet {
    public static void main(String[] args) {

        Student student1 = new Student("Josip", "Ujdur", 35, "M", 2);
        Student student2 = new Student("Franka", "Batelić", 19, "Ž", 1);


        Profesor profesor1 = new Profesor("Darko", "Darkić", 58, "M", "Likovni");
        Profesor profesor2 = new Profesor("Marija", "Marić", 64, "Ž", "Glazbeni");

        student1.predstavljanje();
        student1.dohvatiOpisUloge();

        student2.predstavljanje();
        student2.dohvatiOpisUloge();

        profesor1.predstavljanje();
        profesor1.dohvatiOpisUloge();

        profesor2.predstavljanje();
        profesor2.dohvatiOpisUloge();
    }

}
