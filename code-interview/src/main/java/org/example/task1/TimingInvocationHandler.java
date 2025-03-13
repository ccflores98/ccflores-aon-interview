package org.example.task1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Dynamic proxy to log execution time
public class TimingInvocationHandler implements InvocationHandler {

    private final Object target;

    public TimingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for " + method.getName() + ": " + (endTime - startTime) + " ms");
        return result;
    }

}
