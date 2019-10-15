import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        double inputNumber = scanner.nextDouble();
        if (inputNumber<2){
            System.out.println("The Number Is Not Prime Number");
        } else {
            boolean checkValidate = true;
            for (int i = 2; i<Math.sqrt(inputNumber);i++){
                if (inputNumber%i == 0){
                    checkValidate = false;
                    break;
                }
            }
            if (checkValidate){
                System.out.println("The Number Is Prime");
            } else {
                System.out.println("The Number Is Not Prime");
            }
        }
    }
}
