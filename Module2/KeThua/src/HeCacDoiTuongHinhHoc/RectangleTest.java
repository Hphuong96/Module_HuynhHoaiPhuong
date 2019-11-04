package HeCacDoiTuongHinhHoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println(rectangle.hashCode());
        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        System.out.println(rectangle.hashCode());
        rectangle = new Rectangle("orange",true,2.5,3.8);
        System.out.println(rectangle);
        //System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.hashCode());
//        int[][] arrayrr = new int[1][10];
//        System.out.println(arrayrr.length);
    }
}
