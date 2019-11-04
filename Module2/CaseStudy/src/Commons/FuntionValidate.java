package Commons;

import java.util.Scanner;

public class FuntionValidate {
    private static String regx = "";
    private static Scanner input = new Scanner(System.in);

    public static boolean checkServiceName(String str){
        regx = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]+))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){1,6}$";
        return str.matches(regx);
    }
    public static double checkValidateDoubleNumber(String content ,String errMes){
        while(true){
            try {
                System.out.println(content);
                return input.nextDouble();
            } catch (Exception ex){
                System.out.println(errMes);
            }
        }
    }
    public static int checkValidateIntergerNumber(String content,String errMes){
        while (true){
            try {
                System.out.println(content);
                return input.nextInt();
            } catch (Exception ex){
                System.out.println(errMes);
            }
        }
    }
}
