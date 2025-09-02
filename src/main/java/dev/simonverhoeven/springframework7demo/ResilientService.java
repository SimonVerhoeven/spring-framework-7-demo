package dev.simonverhoeven.springframework7demo;

import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class ResilientService {

    @Retryable(maxAttempts = 5L, jitter = 10L)
    public void retryable() {
    }

    @ConcurrencyLimit(value = 5)
    public void concurrencyLimitedMethod() {}
}
