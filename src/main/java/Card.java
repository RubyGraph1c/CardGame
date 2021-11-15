public class Card {


    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public int getSuitValue() {
        return this.suit.getValue();
    }

    public int getRankValue() {
        return this.rank.getValue();
    }

    public String stringify() {
        return this.rank.toString() + " of " + this.suit.toString();
    } //The toString method returns a String representation of an object in Java

}