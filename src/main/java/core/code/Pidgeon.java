package core.code;

public class Pidgeon extends Bird implements Flying {
    final void eat() {
        System.out.println("Eating, core.code.Pidgeon");
    }

    public final void takeOff() {
        System.out.println("Takeoff, core.code.Pidgeon");
    }

    public final void flight() {
        System.out.println("Flight, core.code.Pidgeon");
    }

    public final void landing() {
        System.out.println("Landing, core.code.Pidgeon");
    }

    Animal breed(Animal partner){
        if(!(partner.getClass() == this.getClass())) throw new Error("Can't breed with this partner");
        Pidgeon child = new Pidgeon();
        return child;
    }
}
