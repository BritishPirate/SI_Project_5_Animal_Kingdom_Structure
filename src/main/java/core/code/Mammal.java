package core.code;

public abstract class Mammal extends Animal {
    public Mammal(Coords pos, boolean gender){
        super(pos, gender);
    }
    void breed(){
        System.out.println("Breathing, core.code.Mammal");
    }
    String breath(){
        return "Breathing, core.code.Mammal";
    }
}
