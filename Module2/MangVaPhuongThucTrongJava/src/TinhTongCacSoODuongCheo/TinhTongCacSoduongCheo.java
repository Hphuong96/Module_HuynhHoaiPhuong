package TinhTongCacSoODuongCheo;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoduongCheo {
    public static void main(String[] args) {
        int row;
        int colum;
        int max1 = 0;
        int max2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao hang : ");
        row = input.nextInt();
        System.out.println("Nhap vao so cot : ");
        colum = input.nextInt();
        int[][] array = new int[row][colum];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() *( row * colum+2) - 51);
            }
            System.out.println((Arrays.toString(array[i])));
        }
        for (int i = 0; i < row; i++) {
            max1 += array[i][i];
            System.out.print("+" + array[i][i] );
        }
        System.out.println(" = " + max1);
        int count = 0 ;
        for (int i = colum-1; i >=0 ; i--) {
            max2 += array[count][i];
            System.out.print("");
            System.out.print("+" + array[count][i]);
            count++;

        }
        System.out.println(" = " + max2);

    }
}
