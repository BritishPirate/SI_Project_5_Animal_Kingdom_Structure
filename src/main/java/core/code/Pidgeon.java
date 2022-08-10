package core.code;

public class Pidgeon extends Bird implements Flying {

    public Pidgeon(){
        this(new Coords());
    }

    public Pidgeon(Coords pos){
        this(pos, false);
    }

    public Pidgeon(boolean gender){
        this(new Coords(), gender);
    }

    public Pidgeon(Coords pos, boolean gender){
        super(pos, gender);
    }

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
}
