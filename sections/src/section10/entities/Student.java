package section10.entities;

public class Student {
    private String name;
    private double firstTerm;
    private double secondTerm;

    private String email;

    public Student() {
        super();
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(String name, double firstTerm, double secondTerm) {
        this.name = name;
        this.firstTerm = firstTerm;
        this.secondTerm = secondTerm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstTerm() {
        return firstTerm;
    }

    public void setFirstTerm(double firstTerm) {
        this.firstTerm = firstTerm;
    }

    public double getSecondTerm() {
        return secondTerm;
    }

    public void setSecondTerm(double secondTerm) {
        this.secondTerm = secondTerm;
    }

    public double average(){
        return (this.firstTerm + this.secondTerm) / 2.0;
    }

    public String getEmail(){
        return email;
    }
}
