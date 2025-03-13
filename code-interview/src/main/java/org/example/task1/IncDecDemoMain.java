package org.example.task1;

import org.example.task1.incdec.IncDec;
import org.example.task1.incdec.MyIncDec;

import java.lang.reflect.Proxy;

public class IncDecDemoMain {
    public static void main(String[] args) {

        // Original object
        IncDec myIncDec = new MyIncDec(0);

        // Creating a proxy instance
        IncDec proxyIncDec = (IncDec) Proxy.newProxyInstance(
                MyIncDec.class.getClassLoader(),
                new Class[]{IncDec.class},
                new TimingInvocationHandler(myIncDec)
        );

        // Call methods and see the timing logs
        proxyIncDec.increment();
        proxyIncDec.increment();
        proxyIncDec.decrement();

    }
}