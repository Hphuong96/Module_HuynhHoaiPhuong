import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Liner Equaton Resolver");
        System.out.println("a*x + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        if (a == 0 && b == 0){
            System.out.println("Phuong trinh vo so nghiem.");
        }
        if (a == 0 && b != 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        if (a != 0 && b != 0){
            System.out.println("Phuong trinh co nghiem =" + (-b/a));
        }
    }
}
