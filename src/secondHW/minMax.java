package secondHW;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        System.out.println("Ведите три числа попарно неравных друг другу");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i=0;i<3;i++) {
            array[i] = sc.nextInt();
        }
        int min=Math.min(Math.min(array[0],array[1]),array[2]);
        int max=Math.max(Math.max(array[0],array[1]),array[2]);
        for (int i=0;i<3;i++) {
            if ((array[i]<max)&&(array[i]>min)) {
                System.out.println(min+" "+array[i]+" "+max);
            }
        }
    }
}
