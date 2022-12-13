import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//  Массивы. Часть 1
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("---------------------- Задача 1 ---------------------");

        int[] intArrays = new int[] {1, 2, 3};
        double[] dblArrays = {3.14, 4.1, 1.33};
        String[] strArrays = {"Java", "SQL", "Это круто"};
    }

    public static void task2() {
        System.out.println("---------------------- Задача 2 ---------------------");

        int[] intArrays = new int[] {1, 2, 3, 4};
        double[] dblArrays = {3.14, 4.1, 1.33};
        String[] strArrays = {"Java", "SQL", "Это круто"};

        for (int i = 0; i < intArrays.length; i++) {
            if (i == intArrays.length - 1) {
                System.out.println(intArrays[i]);
                break;
            }
            System.out.print(intArrays[i] + ", ");
        }

        for (int i = 0; i < dblArrays.length; i++) {
            if (i == dblArrays.length - 1) {
                System.out.println(dblArrays[i]);
                break;
            }
            System.out.print(dblArrays[i] + ", ");
        }

        for (int i = 0; i < strArrays.length; i++) {
            if (i == strArrays.length - 1) {
                System.out.println(strArrays[i]);
                break;
            }
            System.out.print(strArrays[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("---------------------- Задача 3 ---------------------");

        int[] intArrays = new int[] {1, 2, 3, 4};
        double[] dblArrays = {3.14, 4.1, 1.33};
        String[] strArrays = {"Java", "SQL", "Это круто"};

        for (int i = intArrays.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(intArrays[i]);
                break;
            }
            System.out.print(intArrays[i] + ", ");
        }

        for (int i = dblArrays.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(dblArrays[i]);
                break;
            }
            System.out.print(dblArrays[i] + ", ");
        }

        for (int i = strArrays.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(strArrays[i]);
                break;
            }
            System.out.print(strArrays[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("---------------------- Задача 4 ---------------------");

        int[] intArrays = new int[] {1, 2, 3, 4};
        for (int i = 0; i < intArrays.length; i++) {
            if (intArrays[i] % 2 !=0) {
                intArrays[i]++;
            }
        }
        System.out.println(Arrays.toString(intArrays));
    }
}