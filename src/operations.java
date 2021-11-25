import java.util.Locale;
import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        System.out.println("Введите числа с плавующей точкой a и после число b");
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        float aF =input.nextFloat();
        float bF=input.nextFloat();
        int aI = Math.round(aF);
        int bI = Math.round(bF);
        System.out.println((aF + bF)+" " +(aF+bI)+ " " + (aI+bI)+ " -сумма чисел (плавующее с плавающим, плавующее с целым, целое с целым)");
        System.out.println(aF - bF+" " +(aF-bI)+ " " + (aI-bI)+ " -разность чисел");
        System.out.println(aF * bF+" " +(aF*bI)+ " " + (aI*bI)+ " -произведение чисел");
        System.out.println(aF / bF+" " +(aF/bI)+ " " + (aI/bI)+ " -частное чисел");

    }
}
