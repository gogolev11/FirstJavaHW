package secondHW;

import java.util.Scanner;

public class parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        if (n%2==1) {
            System.out.println("Нечётное");
        }
        else {
            System.out.println("Чётное");
        }
    }
}
