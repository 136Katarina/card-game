public class Card {

    private SuitType suit;
    private Values value;

    public Card(SuitType suit,Values value) {
        this.suit = suit;
        this.value = value;
    }

    public SuitType getSuit()
    {
        return this.suit;
    }

    public Values getValue() {
        return this.value;
    }

    public int  getValueFromEnum() {
        return this.value.getValue();
    }
    }