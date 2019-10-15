package PrimeNumber;

import java.util.Scanner;

public class First20PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double InputNumber;
        System.out.println("Nhap so Cac so nguyen to :");
        InputNumber = input.nextDouble();
        int count;
        int N = 2;
        int i;
        boolean prime = true;
        for (count = 0; count < InputNumber; ) {
            for (i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
            if (prime){
                System.out.println(N);
                count+=1;
            }
            N++;
        }
    }
}
