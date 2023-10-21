package org.campus02.personstack;

public class DemoApp {

    public static void main(String[] args) {

        String[] arr = new String[5];
        Stack<String> ps = new Stack<String>(arr);

        ps.push("Element Eins");
        ps.push("Element 2");
        ps.push("Element 3");

        System.out.println(ps.pop());
        System.out.println(ps.pop());
        System.out.println(ps.pop());


        Stack<Integer> intStack = new Stack<Integer>(new Integer[5]);
        intStack.push(5);
        intStack.push(6);
        intStack.push(7);

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());

        Integer n = 6;
        int n2 = n * 2;
        System.out.println(n2);

        int n3 = Integer.parseInt("1234");
        System.out.println(n3);


    }
}
