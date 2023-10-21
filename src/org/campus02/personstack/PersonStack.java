package org.campus02.personstack;

import org.campus02.cards.Card;

public class PersonStack {

    private Card[] cards;
    private int counter;

    public PersonStack(Card[] cards) {
        this.cards = cards;
        counter = -1;
    }

    public void push(Card card) {
        if (counter < cards.length - 1) {
            counter++;
            cards[counter] = card;
            //return ;
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

        return null;
    }
}
