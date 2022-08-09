package core.code;

public class Penguin extends Bird{

    void eat() {
        System.out.println("Eating, core.code.Penguin");
    }

    void sleep() {
        System.out.println("Sleeping, core.code.Penguin");
    }

    void poop() {
        System.out.println("Poop, core.code.Penguin");
    }

    Animal breed(Animal partner){
        if(!(partner.getClass() == this.getClass())) throw new Error("Can't breed with this partner");
        Pidgeon child = new Pidgeon();
        return child;
    }
}
