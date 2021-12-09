package fthHW;

public class Vet {
    void treatAnimal(Animal animal){
        animal.tellType();
        System.out.println(" кушает" + animal.food + " живёт в " + animal.location);
    }
}
