package thirdHW;

public class Bubble {
    int min=Integer.MIN_VALUE;
    void bubbleSort(int array[]) {
        for (int k=array.length;k>0;k--){
            for (int i=0;i<(k-1);i++) {
                if (array[i]>array[i+1]) {
                    min=array[i+1];
                    array[i+1]=array[i];
                    array[i]=min;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
