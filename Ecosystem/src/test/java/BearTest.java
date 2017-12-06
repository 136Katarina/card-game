import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear myBear;
    Salmon simon;
    River myRiver;

    @Before
    public void before() {
        myBear = new Bear("Yogi");
        simon = new Salmon("Simon");
        myRiver = new River("Danube");
        myRiver.addSalmon(simon);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, myBear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        myBear.eat(myRiver);
        assertEquals(0, myRiver.getSalmonCount());
        assertEquals(1,myBear.foodCount());
    }

    @Test
    public void clearsBelly(){
        myBear.eat(myRiver);
        assertEquals(1,myBear.foodCount());
        myBear.sleep();
        assertEquals(0,myBear.foodCount());
    }



}
