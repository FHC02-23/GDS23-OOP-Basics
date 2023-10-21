package org.campus02.cards;

public class UnoGameDemoApp {
    public static void main(String[] args) {

        Card[] arr = new Card[10];

        CardStack cs = new CardStack(arr);

        cs.push(new Card(5, "red"));
        cs.push(new Card(7, "green"));

        Card c = cs.pop();
        System.out.println(c.toString());

        Card blue1 = new Card(1, "blue");
        cs.push(blue1);
        cs.push(new Card(2, "blue"));
        cs.push(new Card(4, "blue"));

        c = cs.pop();
        System.out.println(c.toString());
        System.out.println(cs.pop().toString());
        System.out.println(cs.pop().toString());
        System.out.println(cs.pop().toString());

    }
}
