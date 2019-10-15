package ProfitMoney;

import java.util.Scanner;

public class TienlaiChovay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tien cho vay :");
        money = input.nextDouble();
        System.out.println("Nhap so thang cho vay:");
        month = input.nextInt();
        System.out.println("Nhap Lai %:");
        interset_rate = input.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
