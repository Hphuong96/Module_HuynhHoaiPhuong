package HeCacDoiTuongHinhHoc;

public class Rectangle extends Shape{
    private double width = 1;
    private double lenght = 1;
    public Rectangle(){
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return lenght;
    }

    public void setLength(double lenght) {
        this.lenght = lenght;
    }
    public double getPerimeter(){
        return 2*(width+this.lenght);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
