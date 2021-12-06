package fthHW;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone (String number,String model,int weight) {

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
}


