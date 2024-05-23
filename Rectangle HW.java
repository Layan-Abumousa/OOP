public class Rectangle {
    private double area;
    private double length;
    private double perimeter;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calcArea();
        calcPerimeter();
    }

    public void calcArea() {
        this.area = length * width;
    }

    public void calcPerimeter() {
        this.perimeter = 2 * (length + width);
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

    public void setWidth(double width) {
        this.width = width;
        calcArea();
        calcPerimeter();
    }
}
