package org.example.task1.part2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect  // Marks this class as an Aspect
@Component
public class ExecutionTimeAspect {

    @Around("@annotation(Timed)")  // Intercepts methods annotated with @Timed
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        // Proceed with the original method execution
        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("Execution time for " + joinPoint.getSignature().getName() + ": " + (end - start) + " ms");

        return result;
    }
}