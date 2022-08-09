package core.code;

import java.lang.reflect.Modifier;
import java.util.List;
import java.lang.Class.*;
import java.util.Random;

public abstract class Animal extends java.lang.Object {
    private int age;
    private Animal parent;
    private boolean alive;
    private Coords position;
    private boolean gender;

    abstract void eat();
    abstract void breath();
    abstract void breed();
    // abstract Animal breed(Animal partner);

    public <T extends Animal> T breed2(Animal partner){
        Class anim = partner.getClass();
        boolean sameAnimal = partner.getClass() == this.getClass();
        if(!sameAnimal) throw new Error("Not the same kind of animal!");
        Animal child = null;
        try{
            child = partner.getClass().getDeclaredConstructor().newInstance();
        }
        catch (Exception e){

        }
        finally {
            return child;
        }
    }


    Animal breed(Animal partner){
        if(!(partner.getClass() == this.getClass())) throw new Error("Can't breed with this partner");
        Pidgeon child = new Pidgeon();
        return child;
    }

    public Animal(Coords position, boolean gender){
        this.position = position;
        this.gender = gender;
    }

    public Animal(Coords position){
        this(position, true);
        Random random = new Random();
        boolean randBool = random.nextBoolean();

    }

    public Animal(){
        this(new Coords(0f, 0f, 0f));
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getParent() {
        return parent;
    }

    public void setParent(Animal parent) {
        this.parent = parent;
    }

    public void die(){
        alive = false;
    }

    Coords moveTo(Coords position){
        this.position = position;
        return this.position;
    }

    Coords moveBy(Coords movement){
        position = Coords.add(position, movement);
        return position;
    }

    void sleep(){
        System.out.println("Sleeping");
    }
    void poop(){
        System.out.println("Pooped");
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        boolean bool1 =  age ==

        return super.equals(obj);
    }
}
