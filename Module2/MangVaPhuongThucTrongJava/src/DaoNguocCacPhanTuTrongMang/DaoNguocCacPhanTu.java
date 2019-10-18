package DaoNguocCacPhanTuTrongMang;

import java.util.Scanner;

public class DaoNguocCacPhanTu {
    public static void main(String[] args) {
        byte arraySize;
        int[] array;
        boolean checkValidate;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter array size: ");
            arraySize = input.nextByte();
            if (arraySize < 2 || arraySize > 20) {
                checkValidate = false;
                System.out.println("Out of range !!!");
            } else {
                checkValidate = true;
            }
        } while (!checkValidate);

        array = new int[arraySize];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");


        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[arraySize - 1 - j];
            array[arraySize - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");


        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
