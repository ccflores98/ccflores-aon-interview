package org.example.task1.part2.incdec;

import org.example.task1.part2.Timed;
import org.springframework.stereotype.Component;

@Component
public class MyIncDec implements IncDec
{
    private int x = 0;

    @Timed
    public void increment() {
        this.x++;
    }

    @Timed
    public void decrement() {
        this.x--;
    }

}
