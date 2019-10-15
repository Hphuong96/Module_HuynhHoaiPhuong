package PrimeNumber;

import java.util.Scanner;

class PrimeNumberSmalerThan100 {
    public static void main(String[] args) {
        double InputNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gioi han :");
        InputNumber = input.nextDouble();
        boolean CheckValidate = true;
        for (double i = 2; i <= InputNumber; i++) {
            for (double j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    CheckValidate = false;
                    break;
                } else {
                    CheckValidate = true;
                }
            }
            if (CheckValidate) {
                System.out.println(i);
            }

        }
    }
}
