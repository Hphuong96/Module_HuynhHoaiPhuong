package GopMang;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    private static int[] enterArray() {
        Scanner sc = new Scanner(System.in);
        boolean validate ;
        int size;
        do {
            validate =false;
            System.out.println("nhap do lon cho mang: ");
            size = sc.nextInt();
            if (size > 0) {
                validate = true;
            }
        } while (!validate);
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Enter element " + (i) + " for array 1");
                array[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(array));
        return array;
    }
    public static void main(String[] args) {
        int[] arrayFirst;
        int[] arraySecond;
        int count = 0 ;
        arrayFirst = enterArray();
        arraySecond = enterArray();
        int[] arrayThird = new int[arrayFirst.length+arraySecond.length];
        for (int i = 0; i < arrayThird.length; i++) {
            if (i < arrayFirst.length) {
                arrayThird[i] = arrayFirst[i];
            } else{
                arrayThird[i] = arraySecond[count];
                count++;
            }
        }
        System.out.println(Arrays.toString(arrayThird));

    }
}
