import java.util.Scanner;

public class SayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int inputNumber = scanner.nextInt();
        if (inputNumber <= 10) {
            oneNumber(inputNumber);
            System.out.println();
        }
        if (inputNumber > 10 && inputNumber <= 20) {
            twoNumber(inputNumber);
        }
        if (inputNumber > 20 && inputNumber <= 100) {
            int ten = inputNumber % 10;
            int ones = (inputNumber - ten) / 10;
        }
    }

    public static String twoNumber(int i) {
        String output = " ";
        switch (i) {
            case 11:
                output = "Eleven";
                break;
            case 12:
                output = "Twelve";
                break;
            case 13:
                output = "Thirteen";
                break;
            case 14:
                output = "FourTeen";
                break;
            case 15:
                output = "Fifteen";
                break;
            case 16:
                output = "Sixteen";
                break;
            case 17:
                output = "Seventeen";
                break;
            case 18:
                output = "Eightteen";
                break;
            case 19:
                output = "Nineteen";
                break;
            default:
                break;
        }
        return output;
    }

}

    public static void oneNumber(int i) {
        switch (i) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
    }

    public static void threeNumber(int i) {
        int three = i % 100;


    }


}
