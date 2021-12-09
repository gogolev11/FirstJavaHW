package fthHW;

public class Cat extends Animal {
    public Cat(){
        super();
    }
    @Override
    void tellType(){
        type="Cat";
        System.out.print(type);
    }

    @Override
    void makeNoise() {
        String noise="miau";
    }

    @Override
    void eat() {
        food="milk";
        System.out.println(food);
    }
}
