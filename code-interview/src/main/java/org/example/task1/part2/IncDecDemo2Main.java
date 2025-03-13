package org.example.task1.part2;

import org.example.task1.part2.incdec.IncDec;
import org.example.task1.part2.incdec.MyIncDec;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Proxy;

@SpringBootApplication(scanBasePackages = {"org.example.task1.part2"})
@EnableAspectJAutoProxy // Enables AOP support in Spring
public class IncDecDemo2Main {
    public static void main(String[] args) {

        SpringApplication.run(IncDecDemo2Main.class, args);

    }
}