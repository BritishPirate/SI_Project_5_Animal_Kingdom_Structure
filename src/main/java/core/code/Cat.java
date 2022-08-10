package core.code;

public class Cat extends Mammal {
    int killCount;

    public Cat(){
        this(0);
    }

    public Cat(Coords position){
        this(0, position);
    }

    public Cat(boolean gender){
        this(0, gender);
    }

    public Cat(int killCount){
        this(killCount, new Coords());
    }

    public Cat(int killCount, boolean gender){
        this(killCount, new Coords(), gender);
    }

    public Cat(int killCount, Coords position){
        this(killCount, position, false);
    }

    public Cat(int killCount, Coords position, boolean gender){
        super(position, gender);
        this.killCount = killCount;
    }

    public Animal kill(Animal animal){
        killCount++;
        animal.die();
        return animal;
    }

    //region getters and setters
    public int getKillCount() {
        return killCount;
    }
    //endregion

}
