package thirdHW;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Calculator calc =new Calculator();
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите номер операции");
        System.out.println("1.Сложение");
        System.out.println("2.Деление");
        System.out.println("3.Умножение");
        System.out.println("4.Вычетание");
        int calcType = sc.nextInt();
        System.out.println("Введите цифры для вычисления");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            switch (calcType) {
                case 1:
                    System.out.println(calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println(calc.div(num1, num2));
                    break;
                case 3:
                    System.out.println(calc.multipli(num1, num2));
                    break;
                case 4:
                    System.out.println(calc.subtr(num1, num2));
            }
        } else if (sc.hasNextDouble()) {
            double num1 =sc.nextDouble();
            double num2 =sc.nextDouble();
            switch (calcType) {
                case 1:
                    System.out.println(calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println(calc.div(num1, num2));
                    break;
                case 3:
                    System.out.println(calc.multipli(num1, num2));
                    break;
                case 4:
                    System.out.println(calc.subtr(num1, num2));
            }
        } else if (sc.hasNextLong()) {
            long num1 =sc.nextLong();
            long num2 =sc.nextLong();
            switch (calcType) {
                case 1:
                    System.out.println(calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println(calc.div(num1, num2));
                    break;
                case 3:
                    System.out.println(calc.multipli(num1, num2));
                    break;
                case 4:
                    System.out.println(calc.subtr(num1, num2));
            }
        } else {
            System.out.println("Вы ввели не число");
        }

    }
}
