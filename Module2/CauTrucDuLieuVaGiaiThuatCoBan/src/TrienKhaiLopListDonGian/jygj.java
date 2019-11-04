package TrienKhaiLopListDonGian;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class jygj {
        public static void main(String[] args) {
            while (true) {

                Scanner sc = new Scanner(System.in);
                int input = sc.nextInt();
                System.out.println(Arrays.toString(ad(ad1(input), input)));

            }
        }

        public static int[] ad(int[] arr1, int... arr) {
            int[] arrayThird = new int[arr.length+arr1.length];
            for (int i = 0; i < arrayThird.length; i++) {
                if (i < arrayFirst.length) {
                    arrayThird[i] = arrayFirst[i];
                } else{
                    arrayThird[i] = arraySecond[count];
                    count++;
                }
            }
            return arr;
        }

        public static int[] ad1(int... arr) {
            return arr;
        }
    }
