import core.code.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    /*
    @Test
    public void test_cat_kill(){
        Cat cat = new Cat();
        Pidgeon pidgeon = new Pidgeon();
        Assertions.assertEquals(cat.kill(pidgeon), pidgeon);
    }
    */
    @Test
    public void test_cat_age(){
        Cat cat = new Cat();
        assertEquals(0, cat.getAge());
    }
}