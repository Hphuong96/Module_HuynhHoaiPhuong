package XoaPhanTuKhoiMang;


import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        int inputElement;
        System.out.println(Arrays.toString(array));
        System.out.println("Enter element you want to delete :");
        inputElement = input.nextInt();
        int [] arrayNew = new int[array.length-1];
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == inputElement){
                continue;
            }
            arrayNew[count] = array[i];
            count++;
        }
        System.out.println(Arrays.toString(arrayNew));
    }

}
