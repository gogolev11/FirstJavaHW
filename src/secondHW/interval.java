package secondHW;

import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        double x = (Math.random()*150)+6;
        if ((x>25)&&(x<100)) {
            System.out.println("Число "+x+" входит в интервал (25;100)");
        }
        else {
            System.out.println("Число "+x+" не входит в интервал (25;100)");
        }

    }
}
