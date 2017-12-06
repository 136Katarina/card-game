import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {

    Salmon mySalmon;
    Salmon mySalmon1;
    River myRiver;

    @Before
    public void before (){
        mySalmon = new Salmon("Simon");
        mySalmon1 = new Salmon("Maria");
        myRiver = new River("River");
    }

    @Test
    public void emptyRiver() {
        assertEquals(0, myRiver.getSalmonCount());
    }

    @Test
    public void canAddSalmon(){
        myRiver.addSalmon(mySalmon);
        myRiver.addSalmon(mySalmon1);
        assertEquals(2, myRiver.getSalmonCount());
    }

    @Test
    public void canRemoveSalmon() {
        myRiver.addSalmon(mySalmon);
        myRiver.addSalmon(mySalmon1);
        myRiver.removeSalmon();
        assertEquals(1,myRiver.getSalmonCount());
    }

}
