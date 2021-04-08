package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.add("Helllllo!");
        System.out.println(stack.freePositions());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.poll());
        System.out.println(stack.poll());

        }
    }
