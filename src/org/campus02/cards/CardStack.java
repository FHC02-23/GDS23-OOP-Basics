package org.campus02.cards;

public class CardStack {

    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        counter = -1;
    }

    public void push(Card card) {
        if (counter < cards.length - 1) {
            counter++;
            cards[counter] = card;
        }
        else
            System.out.println("stack is full");
    }

    public Card pop() {
        if (counter >= 0) {
            Card element = cards[counter];
            counter--;
            return element;
        }
        else
            return null;
    }
}
