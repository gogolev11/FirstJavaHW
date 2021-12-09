package fthHW;

public class Horse extends Animal{
    @Override
    void tellType(){
        type="Horse";
        System.out.print(type);
    }

    @Override
    void makeNoise() {
        String noise="igogo";
    }

    @Override
    void eat() {
        food="grass";
        System.out.println(food);
    }
}
