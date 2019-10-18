package TimPhanTuLonNhatTrongMangHaiChieu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        int row;
        int colum;
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
        int max = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println("" + max);

//        cach 2
        //       Random random = new Random();
//        int number = random.nextInt(30 - 20) - 100;
//        for (int i =0 ; i< 150;i++){
//            System.out.print(random.nextInt(201) - 100+ " ");
//        }
    }
}


