package HeCacDoiTuongHinhHoc;

public class Circle extends Shape{
    private double radius = 1;
    public Circle(){
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return radius*radius*Math.PI;
    }
    public double getArea(){
        return radius*2*Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius
                + super.toString();

    }
}
