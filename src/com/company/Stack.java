package com.company;

public class Stack {

    private static final int DEFAULT_STACK_SIZE = 10;

    private int insertPosition = 0;

    private String[] stack;

    public Stack(int size) {
        try {
            this.stack = new String[size];
        } catch (Exception e) {
            System.err.println("Wrong size passed. Default one used: " + DEFAULT_STACK_SIZE);
            this.stack = new String[DEFAULT_STACK_SIZE];
        }
    }

    public void add(String element) {
        if (stack.length < insertPosition) {
            stack[insertPosition++] = element;
        } else {
            System.err.println("StackOverflowError");
            throw new StackOverflowError();
        }
    }

    public String peek() {
        int elementPosition = insertPosition - 1;
        if (elementPosition < 0) {
            return null;
        }
        String element = stack[elementPosition];
        if (stack[elementPosition] != null) {
            return element;
        }
        return null;
    }

    public String poll() {
        String lastValue = peek();
        if (lastValue != null) {
            stack[--insertPosition] = null;
        }
        return lastValue;
    }
    public int size() {
        return insertPosition;
    }
    public int freePositions() {
        return stack.length - insertPosition;
    }
}
