import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS,Values.THREE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS,card.getSuit());
    }

    @Test
    public void canGetValue(){
        assertEquals(Values.QUEEN,card.getValue());
    }

   @Test
    public void queenHasValue(){
        assertEquals(10,card.getValueFromEnum());
   }

   @Test
    public void canGetAllSuits(){
        SuitType[] expected= {SuitType.HEARTS, SuitType.DIAMONDS, SuitType.SPADES, SuitType.CLUBS};
        SuitType[] suits = SuitType.values();
        assertEquals(4,suits.length);
        assertEquals(expected,suits);
   }


//    @Test
//    public void suitCanBeMispelled(){
//        card = new Card( "Heaarts");
//        assertEquals("Heaarts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card(suit:"Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }


}