package sectionEight.entities;

public class Rectangle {
    private double width;
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public  void setWidth(double width) {
        this.width = width;
    }

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return 2 * (width + height);
    }

    public  double Diagonal(){
        return Math.sqrt(Math.pow(2, width) + Math.pow(2, height));
    }
}
