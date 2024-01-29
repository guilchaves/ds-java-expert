package section10.entities;

public class Person {
    private String name;
    private int age;
    private double height;
    private char gender;

    public Person(){
        super();
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(double height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public char getGender(){
        return gender;
    }
}
