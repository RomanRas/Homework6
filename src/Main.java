public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача №1");
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 2
        System.out.println("Задача №2");
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 3
        System.out.println("Задача №3");
        for (byte i = 0; i <18; i+= 2) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 3.1
        System.out.println("Задача №3.1 через условный оператор if");
        for (byte i = 0; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //Задача 4
        System.out.println("Задача №4");
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 5
        System.out.println("Задача №5");
        for (int i = 1904; i < 2096; i+= 4) {
            System.out.println(i + " год является високосным.");
        }
        System.out.println();

        //Задача 6
        System.out.println("Задача №6");
        for (byte i = 7; i < 99; i+= 7) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 7 с указанием номера итерации
        System.out.println("Задача №7");
        for (short i = 1, a = 1; i <= 512; i*= 2, a++) {
            System.out.println("Итерация №" + a + ", значение i = " + i);
        }
        System.out.println();

        //Задача 8
        System.out.println("Задача №8");
        int savings = 0;
        int deposit = 29000;
        for (byte i = 1; i <= 12; i++) {
            savings+= deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей.");
        }
        System.out.println();

        //Задача 9
        System.out.println("Задача №9");
        float savingsAgain = 0f;
        int depositAgain = 29000;
        for (byte i = 1; i <= 12; i++) {
            savingsAgain*= 1.01;
            savingsAgain+= depositAgain;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsAgain + " рублей.");
        }
        System.out.println();

        //Задача 10
        System.out.println("Задача №10");
        for (byte i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}