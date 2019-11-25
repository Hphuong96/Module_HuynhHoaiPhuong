package Commons;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class FuntionValidate {
    private static String regx = "";
    private static Scanner input = new Scanner(System.in);

    public static boolean checkServiceName(String str) {
        regx = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]+))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){1,6}$";
        return str.matches(regx);
    }

    public static double checkValidateDoubleNumber(String content, String errMes) {
        while (true) {
            try {
                System.out.println(content);
                return input.nextDouble();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }

    public static int checkValidateIntergerNumber(String content, String errMes) {
        while (true) {
            try {
                System.out.println(content);
                return input.nextInt();
            } catch (Exception ex) {
                System.out.println(errMes);
                input.next();
                continue;
            }
        }
    }

    public static boolean checkConvenient(String str) {
        str = str.toLowerCase();
        String[] convenient = {"massage", "food", "drink", "car"};
        return Arrays.asList(convenient).contains(str);
    }

    public static boolean checkRoomStandar(String str) {
        str = str.toLowerCase();
        String[] roomStandar = {"vip", "deluxe", "standard"};
        return Arrays.asList(roomStandar).contains(str);
    }

    public static boolean checkTypeOfRent(String str) {
        String[] typeOfRent = {"Month", "Year", "Day", "Hour"};
        return Arrays.asList(typeOfRent).contains(str);
    }

    public static boolean checkDateOfBirth(String str) {
        regx = "(^(((0[1-9]|1[0-9]|2[0-8])[/](0[1-9]|1[012]))|((29|30|31)[/](0[13578]|1[02]))|((29|30)[/](0[4,6,9]|11)))[/](19|[2-9][0-9])\\d\\d$)|(^29[/]02[/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
        return str.matches(regx);
    }

    public static boolean checkGender(String str) {
        str = str.toLowerCase();
        String[] typeOfGender = {"male", "female", "unknown"};
        return Arrays.asList(typeOfGender).contains(str);
    }

    public static boolean checkEmail(String str) {
        regx = "^(\\w{1,20})(@[a-zA-Z0-9]{2,8})(.(\\w{2,4})){1,3}$";
        return str.matches(regx);
    }

    public static boolean checkTypeOfCustomer(String str) {
        str = str.toLowerCase();
        String[] typeOfCustomer = {"vip", "deluxe", "standard"};
        return Arrays.asList(typeOfCustomer).contains(str);
    }

    public static boolean checkIdCard(int str) {
        regx = "^[1-9][0-9]{8}$";
        return String.valueOf(str).matches(regx);
    }
}
