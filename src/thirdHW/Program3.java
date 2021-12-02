package thirdHW;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner sc = new Scanner(System.in);
        int arrLength=sc.nextInt();
        Bubble bubble =new Bubble();
        int[] array = new int[arrLength];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < arrLength; i++) {
            array[i]=sc.nextInt();
        }
        bubble.bubbleSort(array);
    }
}
