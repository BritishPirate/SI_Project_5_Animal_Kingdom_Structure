package core.code;

public interface Flying {
    abstract Coords takeOff();
    abstract void flight(Coords distance);
    abstract void flight(Coords direction, float distance);
    abstract Coords landing();
}
