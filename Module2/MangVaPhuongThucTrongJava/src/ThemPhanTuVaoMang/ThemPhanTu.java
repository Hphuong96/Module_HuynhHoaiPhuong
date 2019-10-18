package ThemPhanTuVaoMang;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int inputNumber;
        int inputPosition;
        boolean valid = true;
        int cout = 0;
        int [] arrayNumber = {1,2,3,4,5,6,7,8,9,10};
        int [] arrayAfterIndex = new int[arrayNumber.length+1];
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println("Enter Number :");
        Scanner input = new Scanner(System.in);
        inputNumber = input.nextInt();
        do {
            System.out.println("Enter Position :");
            inputPosition = input.nextInt();
            if (inputPosition<0 || inputPosition >10){
                valid = false;
            }
        } while(!valid);
        for (int i = 0; i <= arrayNumber.length ; i++) {
            if (i == inputPosition){
                arrayAfterIndex[i] = inputNumber;
            } else {
                arrayAfterIndex[i] = arrayNumber[cout];
                cout += 1;
            }

        }
        System.out.println(Arrays.toString(arrayAfterIndex));





    }
}
