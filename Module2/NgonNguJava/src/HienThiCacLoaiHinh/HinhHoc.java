package HienThiHinhHoc;

public class HinhHoc {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
        for (int i = 7; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        int k = 4;
        for (int i = 7; i >= 1 ; i--) {
            for (int j = 1 ; j <= k; j++) {
                System.out.print(" ");
                if (j >= k && j <= k+i ){
                    System.out.print("*");
                }
            }
            k = k - 1;
            System.out.println("");
        }
    }
}
