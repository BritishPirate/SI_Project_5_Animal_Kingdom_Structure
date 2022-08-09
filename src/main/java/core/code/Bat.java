package core.code;

public class Bat extends Mammal implements Flying {
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
