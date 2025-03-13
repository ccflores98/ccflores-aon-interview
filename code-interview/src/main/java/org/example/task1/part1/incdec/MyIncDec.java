package org.example.task1.part1.incdec;

public class MyIncDec implements IncDec
{
    private int x;

    public MyIncDec(int x) {
        this.x = x;
    }

    public void increment() {
        this.x++;
    }

    public void decrement() {
        this.x--;
    }

}
