package core.code;

public class Penguin extends Bird{
    public Penguin(){
        this(new Coords());
    }

    public Penguin(Coords pos){
        this(pos, false);
    }

    public Penguin(boolean gender){
        this(new Coords(), gender);
    }

    public Penguin(Coords pos, boolean gender){
        super(pos, gender);
    }
}
