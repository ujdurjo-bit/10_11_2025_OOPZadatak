public abstract class Osoba {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    public Osoba(String firstName, String lastName, int age, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }


    public void predstavljanje() {
        System.out.println("Ime: " + getFirstName() + ", Prezime: " + getFirstName() + ", dob: " + getAge() + ", spol: " + getSex());


    }

    public abstract void dohvatiOpisUloge();
}
