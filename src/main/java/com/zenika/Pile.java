package com.zenika;

public class Pile {
    private int[] elements;
    private int top;

    public Pile(int capacity) {
        elements = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            throw new IllegalStateException("Pile pleine");
        }
        top++;
        elements[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pile vide");
        }
        int data = elements[top];
        top--;
        return data;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == elements.length - 1;
    }
}