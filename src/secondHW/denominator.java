package secondHW;

import java.util.Scanner;

public class denominator {
    public static void main(String[] args) {
        System.out.println("Ведите число, чьи делители надо узнать");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Делители числа "+x);
        for (int i=1;i<=x;i++) {
            if (x%i==0){
                System.out.println(i);
            }
        }
    }
}

