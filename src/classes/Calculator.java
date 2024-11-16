package classes;

public class Calculator {

    public static String sum(String num1, String num2){
        double dNum1 = convertToD(num1);
        double dNum2 = convertToD(num2);
        return Double.toString(dNum1 + dNum2);
    }

    public static String subtract(String num1, String num2){
        double dNum1 = convertToD(num1);
        double dNum2 = convertToD(num2);
        return Double.toString(dNum1 - dNum2);
    }

    public static String multiply(String num1, String num2){
        double dNum1 = convertToD(num1);
        double dNum2 = convertToD(num2);
        return Double.toString(dNum1 * dNum2);
    }

    public static String divine(String num1, String num2){
        double dNum1 = convertToD(num1);
        double dNum2 = convertToD(num2);
        if (dNum2 == 0) {
            return "На ноль делить нельзя";
        } else {
            return Double.toString(dNum1 / dNum2);
        }
    }

    private static double convertToD(String num) {
        double dNum = 0;
        try {
            dNum = Double.parseDouble(num);
        } catch (NumberFormatException e) {
            System.out.println("Неверный тип данных");
            System.exit(0);
        }
        return dNum;
    }


}
