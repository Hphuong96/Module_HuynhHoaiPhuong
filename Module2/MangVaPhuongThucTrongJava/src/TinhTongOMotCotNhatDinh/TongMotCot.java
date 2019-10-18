package TinhTongOMotCotNhatDinh;

import java.util.Arrays;
import java.util.Scanner;

public class TongMotCot {
    public static void main(String[] args) {
        int row;
        int colum;
        int inputColumn;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so hang : ");
        row = input.nextInt();
        System.out.println("Nhap vao so cot : ");
        colum = input.nextInt();
        int[][] array = new int[row][colum];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * row * colum - 50);
            }
            System.out.println((Arrays.toString(array[i])));
        }
        System.out.println("Ban muon tinh tong cot so may :");
        inputColumn = input.nextInt();
        int tong = 0;
        for (int i = 0; i < row ; i++) {
            tong += array[i][inputColumn-1];
            System.out.print("+" + array[i][inputColumn-1]);
        }
        System.out.print(" = " + tong);
    }
}
