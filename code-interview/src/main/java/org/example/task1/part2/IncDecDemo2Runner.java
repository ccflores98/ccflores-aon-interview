package org.example.task1.part2;

import org.example.task1.part2.incdec.MyIncDec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class IncDecDemo2Runner implements CommandLineRunner {

    @Autowired
    private MyIncDec myIncDec;

    @Override
    public void run(String... args) throws Exception {
        myIncDec.increment();
        myIncDec.decrement();
    }
}
