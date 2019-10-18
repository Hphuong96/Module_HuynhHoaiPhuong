package DemSoLanXuatHienCuaKyTuTrongChuoi;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
       String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
       String element;
       int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        System.out.println("enter element:");
        element = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
