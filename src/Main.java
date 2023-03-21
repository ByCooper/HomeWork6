public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача №1" + "\n");

        for (int i = 1; i <= 10; i++)
            System.out.println("Итерация цикла " + i);
    }

    public static void task2() {
        System.out.println("\n" + "Задача №2" + "\n");

        for (int i = 10; i >= 1; i--)
            System.out.println("Итерация цикла " + i);

    }

    public static void task3() {
        System.out.println("\n" + "Задача №3" + "\n");

        System.out.println("Четные числа в диапозоне от 0 до 17 равны:");

        for (int i = 0; i <= 17; i++)
            if (i % 2 == 0) {
                System.out.println(i);

 //Второй вариант решения
//        for (int j = 0; j <= 17; j += 2)
//            System.out.println(j);
        }
    }
    public static void task4() {
        System.out.println("\n" + "Задача №4" + "\n");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void task5() {
        System.out.println("\n" + "Задача №5" + "\n");

        int firstYear = 1904;
        int lastYear = 2096;

        for (int i = firstYear; i <= lastYear; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6() {
        System.out.println("\n" + "Задача №6" + "\n");

        int lastNumber = 98;
        int startNumber = 7;

        for (int i = startNumber; i <= lastNumber; i += 7) {
            System.out.println(i);
        }
    }
    public static void task7() {
        System.out.println("\n" + "Задача №7" + "\n");

        int start = 1;
        int last = 512;

        for (int i = start; i <= last; i *= 2) {
            System.out.println(i);
        }
    }
    public static void task8() {
        System.out.println("\n" + "Задача №8" + "\n");

        int sumCash = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + sumCash;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9() {
        System.out.println("\n" + "Задача №9" + "\n");

        int sumCash = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            int percentCash = sumCash + sumCash / 100;
            total = total + sumCash;
            total = total + total / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task10() {
        System.out.println("\n" + "Задача №10" + "\n");

        int a = 2;

        for (int i = 1; i <= 10; i++) {
            int work = a * i;
            System.out.println(a + " * " + i + " = " + work);
        }
    }
}