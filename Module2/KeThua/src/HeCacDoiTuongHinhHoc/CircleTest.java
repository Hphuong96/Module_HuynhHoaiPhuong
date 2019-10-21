package HeCacDoiTuongHinhHoc;

public class CircleTest {
   static public void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);
    }
}
