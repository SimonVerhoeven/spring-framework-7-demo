package dev.simonverhoeven.springframework7demo;

import jakarta.annotation.Nullable;
import org.jspecify.annotations.NonNull;

public class JSpecifyDemoService {

    static @Nullable String findUsername(@NonNull Integer id) {
        if (id == 42) {
            return "Douglas Adams";
        } else {
            return null;
        }
    }

    static @NonNull String findUsernameSafely(@Nullable Integer id) {
        if (null == id || id != 42) {
            return "";
        } else {
            return "Douglas Adams";
        }
    }
}
