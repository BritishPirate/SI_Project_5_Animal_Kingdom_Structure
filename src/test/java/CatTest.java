import core.code.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void test_cat_age(){
        Cat cat = new Cat();
        assertEquals(0, cat.getAge());
    }

    @Test
    public void test_get_killcount(){
        Cat cat = new Cat();
        assertEquals(0, cat.getKillCount());
    }

    @Test
    public void test_cat_kill(){
        Cat cat = new Cat();
        Pidgeon pidgeon = new Pidgeon();
        assertEquals(cat.kill(pidgeon), pidgeon);
    }

    @Test
    public void test_constructor_setting_killcount(){
        Cat cat = new Cat(5);
        assertEquals(5, cat.getKillCount());
    }

    @Test
    public void test_get_position(){
        Cat cat = new Cat();
        assertEquals(new Coords(0, 0), cat.getPosition());
    }

    @Test
    public void test_constructor_setting_position(){
        Cat cat = new Cat(new Coords(5, 5));
        assertEquals(5, cat.getKillCount());
    }

    @Test
    public void test_get_gender(){
        Cat cat = new Cat();
        assertEquals(false, cat.getGender());
    }

    @Test
    public void test_constructor_setting_gender(){
        Cat cat = new Cat(5);
        assertEquals(5, cat.getKillCount());
    }

    //template
    @Test
    public void test(){

    }
}