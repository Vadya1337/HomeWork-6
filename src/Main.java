import java.security.spec.RSAOtherPrimeInfo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        // Задание 2

        for (int i = 10; i >= 1; i -- ) {
            System.out.println(i);
        }
        System.out.println();
        // Задание 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();

        // Задание 4

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();

        // Задание 5

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println();
        // Задание 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задание 7
        System.out.println();

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задание 8
        System.out.println();

        int otklad = 29000;
        int summ = 0;
        for (int i = 1; i <= 12; i++) {
           summ = otklad + summ ;
            System.out.println("Месяц " + i + " сумма накоплений равна " + summ + " рублей");
        }

        // Задание 9
        System.out.println();
        int vklad = 29000;
        int summm = 0;
        for (int i = 1; i <= 12; i++) {
            summm = summm + vklad /100 * 12;
            summm = summm + vklad;
            System.out.println("Месяц " + i + " Итого " + summm);
        }

        // Задание 10
        System.out.println();
        int chislo = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(chislo + "*" + i + "=" + chislo * i);
        }
    }
}