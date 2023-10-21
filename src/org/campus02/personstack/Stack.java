package org.campus02.personstack;

public class Stack<T> {

    private T[] arr;
    private int counter;

    public Stack(T[] arr) {
        this.arr = arr;
        counter = -1;
    }

    public void push(T p) {
        if (counter < arr.length - 1) {
            counter++;
            arr[counter] = p;
            //return ;
        }
        else
            System.out.println("stack is full");
    }

    public T pop() {
        if (counter >= 0) {
            T element = arr[counter];
            counter--;
            return element;
        }

        return null;
    }
}
