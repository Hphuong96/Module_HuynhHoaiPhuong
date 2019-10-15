package MoneyExchange;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner inputMoney  = new Scanner(System.in);
        int InputUSD ;
        int OutputVND ;
        System.out.println("Enter so tien can chuyen doi ;");
        InputUSD = inputMoney.nextInt();
        OutputVND = InputUSD*23000;
        System.out.printf("USD : %,d",OutputVND);
    }

}
