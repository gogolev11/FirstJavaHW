import java.util.Locale;
import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        System.out.println("Введите параметр a и b для линейного уровнения");
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        float a= input.nextFloat();
        float b= input.nextFloat();
        System.out.println("Ваше уровнение:"+a+"x"+" + "+b+" = 0");
        float x=(-1)*b/a;
        System.out.println("x="+x);
    }
}
