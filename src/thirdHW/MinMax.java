package thirdHW;

import java.util.Arrays;

public class MinMax {
    void max(double array[]) {
        Arrays.sort(array);
        System.out.println(array[0]);
    }
    void min(double array[]) {
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}
