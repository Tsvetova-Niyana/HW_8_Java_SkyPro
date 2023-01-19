import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        task_1();
        task_2();
        task_3();
        task_4();
    }


    private static void task_1() {
        /*
        Объявите три массива:

        1. Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        3. Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        с помощью ключевого слова или сразу заполненный элементами.

        Объявление массива из 12 элементов, заполненного нулями:

        int [] weight = new int [12];

        Объявление целочисленного массива, заполненного 12 элементами:

        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
         */

        System.out.println("Задание 1");

        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        double[] arrDouble = {1.57, 7.654, 9.986};
        int[] arrArbitrary = {7, 54, 986};


        System.out.println(arrInt[0] + " " + arrInt[1] + " " + arrInt[2]);
        System.out.println(arrDouble[0] + " " + arrDouble[1] + " " + arrDouble[2]);
        System.out.println(arrArbitrary[0] + " " + arrArbitrary[1] + " " + arrArbitrary[2]);

    }

    private static void task_2() {
        /*
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо.
         */
        System.out.println("\nЗадание 2");

        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        double[] arrDouble = {1.57, 7.654, 9.986};
        int[] arrArbitrary = {7, 54, 986};

        for (int i = 0; i < arrInt.length; i++) {
            if (i != arrInt.length - 1) {
            System.out.print(arrInt[i] + ", ");
            }
            else{
            System.out.print(arrInt[i]);
                }
        }
        System.out.println();

        for (int i = 0; i < arrDouble.length; i++) {
            if (i != arrDouble.length - 1) {
                System.out.print(arrDouble[i] + ", ");
            }
            else{
                System.out.print(arrDouble[i]);
            }
        }

        System.out.println();

        for (int i = 0; i < arrArbitrary.length; i++) {
            if (i != arrArbitrary.length - 1) {
                System.out.print(arrArbitrary[i] + ", ");
            }
            else{
                System.out.print(arrArbitrary[i]);
            }
        }
        System.out.println();
    }

    private static void task_3() {
        /*
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.

        Если в задаче № 2 в консоль у вас вывелся результат:

        1, 2, 3
        1.57, 7.654, 9.986
        // произвольные элементы третьего массива

        то в этой задаче результат должен быть таким:

        3, 2, 1
        9.986, 7.654, 1.57
        // произвольные элементы третьего массива в обратном порядке
         */

        System.out.println("\nЗадание 3");

        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        double[] arrDouble = {1.57, 7.654, 9.986};
        int[] arrArbitrary = {7, 54, 986};

        for (int i = arrInt.length - 1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(arrInt[i] + ", ");
            }
            else{
                System.out.print(arrInt[i]);
            }
        }

        System.out.println();

        for (int i = arrDouble.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrDouble[i] + ", ");
            }
            else{
                System.out.print(arrDouble[i]);
            }
        }

        System.out.println();

        for (int i = arrArbitrary.length - 1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(arrArbitrary[i] + ", ");
            }
            else{
                System.out.print(arrArbitrary[i]);
            }
        }
    }

    private static void task_4() {
        /*
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).

        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.

        Распечатайте результат преобразования в консоль.

        Если формат вывода элементов массива в консоль не важен, то распечатайте элементы массива с помощью метода
        Arrays.toString ().

        Для этого после объявления и инициализации массива напишите команду System.out.println,
        внутри нее — Arrays.toString, в круглых скобках которого укажите имя массива:

        int [] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        Метод выводит элементы массива одной строчкой через запятую в квадратных скобках:

        [1, 2, 3]

        Подробнее о методе Arrays.toString рассказывается в шпаргалке.
         */

        System.out.println("\nЗадание 4");

        int[] arrInt = new int[5];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrInt));

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
