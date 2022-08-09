package core.code;

public class DBP extends Mammal {
    void eat() {
        System.out.println("Eating");
    }

    @Override
    void breed(){
        System.out.println("Breeding, Platypus");
    }
}
