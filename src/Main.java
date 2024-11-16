import classes.Calculator;
import classes.Pair;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        1. Написать класс Калькулятор (необобщенный), который содержит
        обобщенные статические методы: sum(), multiply(), divide(),
        subtract(). Параметры этих методов – два числа разного типа,
        над которыми должна быть произведена операция. Методы должны
        возвращать результат своей работы
         */
        String cif1 = "124";
        String cif2 = "0.2";

        System.out.println("Первое число " + cif1 + " и второе число " + cif2);
        System.out.println("Сумма = " + Calculator.sum(cif1, cif2));
        System.out.println("Разность = " + Calculator.subtract(cif1, cif2));
        System.out.println("Произведение = " + Calculator.multiply(cif1, cif2));
        System.out.println("Деление = " + Calculator.divine(cif1, cif2));

        /*
        2. Напишите обобщенный метод compareArrays(), который принимает
        два массива и возвращает true, если они одинаковые, и false
        в противном случае. Массивы могут быть любого типа данных, но
        должны иметь одинаковую длину и содержать элементы одного типа
        по парно по индексам.
         */
        String[] seasons  = {"Зима", "Весна", "Лето", "Осень"};
        Integer[] numbers = {3, 7, 11, 37};
        String[] strings = {"3", "7", "11", "37"};

        System.out.println("\nВот такие массивы: ");
        System.out.println(Arrays.toString(seasons));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));
        if (compareArr(seasons, numbers)) {
            System.out.println("Массивы seasons и numbers одинаковые");
        } else {
            System.out.println("Массивы seasons и numbers не равны");
        }
        if (compareArr(numbers, strings)) {
            System.out.println("Массивы numbers и strings одинаковые");
        } else {
            System.out.println("Массивы numbers и strings не равны");
        }

        /*
        3. Напишите обобщенный класс Pair, который представляет собой пару значений
        разного типа. Класс должен иметь методы getFirst(), getSecond() для получения
        значений каждого из составляющих пары, а также переопределение метода toString(),
        возвращающее строковое представление пары.
         */

        Pair<Integer, String> pair = new Pair<>(47, "all");
        System.out.println();
        System.out.println("В паре " + pair.toString() + " два значения. Первое: "
                + pair.getFirst() + " и второе: " + pair.getSecond());
    }

    private static <T> boolean compareArr(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
                return false;
            }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

}