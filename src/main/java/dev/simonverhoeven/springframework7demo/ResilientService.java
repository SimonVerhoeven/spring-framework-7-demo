package dev.simonverhoeven.springframework7demo;

import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class ResilientService {

    @Retryable(
            maxAttempts = 5L,
            jitter = 10L,
            multiplier = 2L
    )
    public void retryable() {
        if (50 < ThreadLocalRandom.current().nextInt(0, 100)) {
            throw new RuntimeException("Random failure");
        } else {
            System.out.println("Random success");
        }
    }

    @ConcurrencyLimit(value = 5)
    public void concurrencyLimitedMethod() {}
}
