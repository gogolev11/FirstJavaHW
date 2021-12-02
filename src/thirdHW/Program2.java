package thirdHW;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        MinMax func =new MinMax();
        System.out.println("Введите число элементов массива");
        Scanner sc =new Scanner(System.in);
        double[] array = new double[sc.nextInt()];
        System.out.println("Введите элементы массива");
        for (int i=0;i< array.length;i++) {
            array[i]=sc.nextDouble();
        }
        System.out.print("Максимум ");
        func.max(array);
        System.out.print("Минимум ");
        func.max(array);

    }
}
