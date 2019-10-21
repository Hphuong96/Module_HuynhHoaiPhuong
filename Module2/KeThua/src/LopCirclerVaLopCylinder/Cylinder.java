package LopCirclerVaLopCylinder;

public class Cylinder extends Circle {
    private double height = 4;
    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "Volume" +
                getVolume() +
                '}';
    }
}
