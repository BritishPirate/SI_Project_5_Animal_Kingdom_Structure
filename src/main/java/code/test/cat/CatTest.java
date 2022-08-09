package code.test.cat;


import core.code.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {

    @Test
    public void test_cat_kill(){
        Cat cat = new Cat();
        Pidgeon pidgeon = new Pidgeon();
        Assertions.assertEquals(cat.kill(pidgeon), pidgeon);
    }


}
