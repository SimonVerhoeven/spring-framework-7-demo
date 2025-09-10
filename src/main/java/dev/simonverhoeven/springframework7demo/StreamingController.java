package dev.simonverhoeven.springframework7demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

@Controller
public class StreamingController {

    @PostMapping("/upload")
    public void upload(InputStream inputStream) {
        // processing
    }

    @GetMapping("/downloadMeaningOfLife")
    public OutputStream downloadMeaningOfLife() throws IOException {
        final var outputStream = new ByteArrayOutputStream();
        outputStream.write("42".getBytes(StandardCharsets.UTF_8));
        return outputStream;
    }
}
