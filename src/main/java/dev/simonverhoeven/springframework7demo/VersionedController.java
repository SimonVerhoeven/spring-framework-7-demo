package dev.simonverhoeven.springframework7demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionedController {

    @GetMapping(
            path = "version",
            version = "1.1"
    )
    public String versionOne() {
        return "one";
    }

    @GetMapping(
            path = "version",
            version = "1.1+"
    )
    public String versionLatest() {
        return "latest";
    }
}
