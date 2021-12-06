package fthHW;

public class Phone {
    private String number;
    private String model;
     int weight;

    public Phone (String number,String model,int weight) {
        this(number,model);
        this.weight=weight;
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

}


