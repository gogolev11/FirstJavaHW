package fthHW;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
     private int weight;
     private String name;


    public Phone (String number,String model,int weight,String name) {
        this(number,model);
        this.weight=weight;
        this.name=name;
    }

    public Phone (String number,String model) {
        this.number=number;
        this.model=model;
    }

    public Phone () {

    }
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public int getWeight() {
        return weight;
    }
    void receiveCall(String name) {
        System.out.println("Звонит "+name);
    }

    void receiveCall(String name,String number) {
        System.out.println("Звонит "+name+" "+number);
    }
    static void sendMessage(String[] telArr) {
        System.out.println(Arrays.toString(telArr));
    }

}


