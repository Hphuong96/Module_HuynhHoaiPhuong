package TimGiaTriNhoNhatTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int arraySize;
        Scanner input = new Scanner(System.in);
        boolean validate;
        do {
            validate = false;
            System.out.println("Nhap do lon cho mang :");
            arraySize = input.nextInt();
            if (arraySize > 0){
                validate =true;
            }
        }while(!validate);
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length ; i++) {
            System.out.println("enter element " + (i+1) + ":");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Gia tri nho nhat :"+min);

    }
}
