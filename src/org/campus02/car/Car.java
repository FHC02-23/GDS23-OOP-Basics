package org.campus02.car;

public class Car {
    public String colour;
    public int countDoors;
    public int mileage;
    public String name;
    public int currentGear;

    public void setCurrentGear(int currentGear) {
        int x = 4;
        if (currentGear > 0 && currentGear < 8) {
            this.currentGear = currentGear;
        }
        else {
            System.out.println(currentGear + " not allowed!");
        }
    }

    public int getCurrentGear() {
        //x = 9;
        return currentGear;
    }

    public void nextGear() {
        if (currentGear < 7) {
            currentGear++;
        }
        else {
            System.out.println("max gear reached!");
        }
    }

    public void lowerGear() {
        if (currentGear > 1) {
            currentGear--;
        }
        else {
            System.out.println("min gear reached!");
        }
    }
}
