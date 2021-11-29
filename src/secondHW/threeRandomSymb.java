package secondHW;

import java.util.Random;

public class threeRandomSymb {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(900)+100;
        System.out.println("Число:"+x);
        System.out.println(x/100+" "+(x/10-x/100*10)+" "+(x%10));
    }
}
