package secondHW;

public class oddList {
    public static void main(String[] args) {
        int count = 1+55*2;
        int k=0;
        for (int i=1;i<count;i=i+2) {
            System.out.println(i);
            System.out.println("Количество элементов последовательности "+(++k));
        }

    }
}
