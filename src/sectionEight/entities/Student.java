package sectionEight.entities;

public class Student {

    private String name;
    private double qOne;
    private double qTwo;
    private double qThree;

    public Student(String name, double qOne, double qTwo, double qThree) {
        this.name = name;
        this.qOne = qOne;
        this.qTwo = qTwo;
        this.qThree = qThree;
    }

    public double finalGrade(){
       return qOne + qTwo + qThree;
    }

    public void isApproved(double finalGrade){
        if (finalGrade >= 60.00){
            System.out.println("PASS");
        } else {
            double missing = 60.00 - finalGrade;
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", missing);
        }
    }
}
