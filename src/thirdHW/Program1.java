package thirdHW;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Calculator calc =new Calculator();
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите номер операции");
        if (sc.hasNextInt()) {
            int calcType = sc.nextInt();
            System.out.println("Введите цифры для вычисления");
        } else if (sc.hasNextDouble()) {
            double calcType =sc.nextDouble();
        } else if (sc.hasNextLong()) {
            long calcType =sc.nextLong();
        } else {
            System.out.println("Вы ввели не число");
        }


    }
}
