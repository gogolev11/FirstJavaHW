package fthHW;

public class App {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+79211234567","Samsung",125);
        Phone phone2 = new Phone("+79314567893","IPhone",155);
        Phone phone3 = new Phone("+79116547832","Xiomi",120);
        phone1.receiveCall("Jone");
        System.out.println(phone1.getNumber()+" "+phone1.getModel()+" "+phone1.getWeight());
        phone2.receiveCall("Sabrina");
        System.out.println(phone2.getNumber()+" "+phone2.getModel()+" "+phone2.getWeight());
        phone3.receiveCall("Mike");
        System.out.println(phone3.getNumber()+" "+phone3.getModel()+" "+phone3.getWeight());

    }
}
