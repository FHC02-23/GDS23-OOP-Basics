package org.campus02.cards;

public class CardStack {

    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        counter = -1;
    }

    public void push(Card card) {
        counter++;
        cards[counter] = card;
    }

    public Card pop() {
        Card element = cards[counter];
        counter--;
        return element;
    }
}
