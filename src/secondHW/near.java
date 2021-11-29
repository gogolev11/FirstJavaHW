package secondHW;

import java.util.Scanner;

public class near {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m = sc.nextFloat();
        float n =sc.nextFloat();
        float near=0;
        if ((Math.abs(n-10))<(Math.abs(m-10))) {
            near=n;
        }
        else {
            near=m;
        }
        System.out.println("Ближайшее число к 10 "+near);
    }
}
