public class Circle {
    private double area;
    private double length;
    private double perimeter;
    private double width;

    public Circle(double length) {
        this.length = length;
        calcArea();
        calcPerimeter();
    }

    public void calcArea() {
        // نفترض أن 'length' يشير إلى النصف قطر
        this.area = Math.PI * length * length;
    }

    public void calcPerimeter() {
        this.perimeter = 2 * Math.PI * length;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setLength(double length) {
        this.length = length;
        calcArea();
        calcPerimeter();
    }
}
