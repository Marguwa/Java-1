package Java_1.git;

public class HW_2 {
    public static void main(String[] args) {
        Task_1();
        Task_2();
        Task_3();
        Task_4();
        Task_5();
        System.out.println(Task_6(new int[]{1, 5, 5, 1}));
        System.out.println(Task_6(new int[]{20, 5, 5, 5, 5}));
        Task_7(new int[]{1, 5, 2, 11, 4, 5, 2, 4, 8, 9, 1, 35, 0, -2, 5}, -5);
    }

    /* Task_1
    ** Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    ** С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */

    public static void Task_1() {
        System.out.println("Task 1");

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] = (arr[i] == 0) ? 1 : 0);
            if (i != 9)
                System.out.print(", ");
        }
    }

    /* Task_2
    ** Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    */

    public static void Task_2() {
        System.out.println("\n");
        System.out.println("Task 2");
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
    }

    /* Task_3
    ** Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */


    public static void Task_3() {
        System.out.println("\n");
        System.out.println("Task 3");

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] < 6) ?  (arr[i] * 2) : arr[i]);
            System.out.print(" ");
        }
    }

    /* Task_4
    ** Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    ** и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    */


    public static void Task_4() {
        System.out.println("\n");
        System.out.println("Task 4");

        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < 5; j++) {
                if ((table[i] == table[j]) || (table[j] == table[table.length - 1 - i]))
                    table[i][j] = 1;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }

    /* Task_5
     ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */


    public static void Task_5() {
        System.out.println("\n");
        System.out.println("Task 5");

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, 35, 0};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

    /* Task_6
     ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место,
     * в котором сумма левой и правой части массива равны.
     * Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
     * checkBalance([1, 1, 1, || 2, 1]) → true,
     * граница показана символами ||,
     * эти символы в массив не входят.
     */


    public static boolean Task_6(int[] arr) {
        System.out.println("\n");
        System.out.println("Task 6");

        boolean k = false;

        int iSum = 0;
        int jSum = 0;
        int x = arr.length / 2;

        for (int i = 0; i < x; i++) {
            iSum += arr[i];
        }

        for (int j = x; j < arr.length; j++) {
            if (x%2 != 0)
                jSum += arr[j-1];
            else
                jSum += arr[j];
        }


        k = (iSum == jSum) ? true : false;

        System.out.println("iSum = " + iSum);
        System.out.println("jSum = " + jSum);

        return k;

    }

    /* Task_7
    * * **** Написать метод, которому на вход подается одномерный массив и
    * число n (может быть положительным, или отрицательным),
    * при этом метод должен сместить все элементымассива на n позиций.
    * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    * */


    static void Task_7(int[] arr, int n) {
        System.out.println("\n");
        System.out.println("Task 7");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int k = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = k;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int k = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = k;
            }
        }

        System.out.print("\n");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
