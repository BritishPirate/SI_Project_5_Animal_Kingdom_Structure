package core.code;

public abstract class Bird extends Animal {

    public Bird(Coords pos, boolean gender){
        super(pos, gender);
    }

    String breath(){
        return "Breathing, core.code.Bird";
    }
}
