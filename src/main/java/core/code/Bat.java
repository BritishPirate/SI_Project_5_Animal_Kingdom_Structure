package core.code;

import java.lang.reflect.GenericArrayType;

public class Bat extends Mammal implements Flying {

    public Bat(){
        this(new Coords());
    }

    public Bat(Coords pos){
        this(pos, false);
    }

    public Bat(boolean gender){
        this(new Coords(), gender);
    }

    public Bat(Coords pos, boolean gender){
        super(pos, gender);
    }

    public void eat(){
        System.out.println("Eating, core.code.Bat");
    }

    public void takeOff() {
        System.out.println("Takeoff, core.code.Bat");
    }

    public void flight() {
        System.out.println("Flight, core.code.Bat");
    }

    public void landing() {
        System.out.println("Landing, core.code.Bat");
    }
}
