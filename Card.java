package my.pokercalculator;

public class Card {
    private int suit;
    private float val;
    Card(int suit, float val) {
        this.suit = suit;
        this.val = val;
    }
    public int getSuit(){
        return suit;
    }
    public float getVal(){
        return val;
    }
}
