package Q_11;

public class Rectangle {

    private double length;
    private double width;


    public Rectangle() {
    }


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        return this.length*this.width;
    }

    public double calculatePerimeter(){
        return ((this.length*2)+(this.width*2));
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(5);

        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
    }
}
