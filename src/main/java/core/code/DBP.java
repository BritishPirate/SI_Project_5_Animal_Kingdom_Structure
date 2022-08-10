package core.code;

public class DBP extends Mammal {

    public DBP(){
        this(new Coords());
    }

    public DBP(Coords pos){
        this(pos, false);
    }

    public DBP(boolean gender){
        this(new Coords(), gender);
    }

    public DBP(Coords pos, boolean gender){
        super(pos, gender);
    }

    void eat() {
        System.out.println("Eating");
    }

    @Override
    void breed(){
        System.out.println("Breeding, Platypus");
    }
}
