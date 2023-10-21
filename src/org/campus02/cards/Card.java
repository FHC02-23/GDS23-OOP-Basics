package org.campus02.cards;

public class Card {
    private int value;
    private String colour;

    public Card(int value, String colour) {
        if (value >= 1 && value <= 9)
            this.value = value;
        else
            System.out.println(value + " needs to between 1 and 9");

        if (colour.equals("blue") || colour.equals("red")
                || colour.equals("green") || colour.equals("yellow")) {
            this.colour = colour;
        }
        else {
            System.out.println(colour + " is a wrong colour!");
        }
    }

    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }
}
