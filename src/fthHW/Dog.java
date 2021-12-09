package fthHW;

public class Dog extends Animal{
    @Override
    void tellType(){
        type="Dog";
        System.out.print(type);
    }

    @Override
    void makeNoise() {
        String noise="gav";
    }

    @Override
    void eat() {
        food="meat";
        System.out.println(food);
    }
}
