package dev.simonverhoeven.springframework7demo;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestClientDemoController {

    @GetMapping
    public Response greeting()
    { new HttpHeaders().getO;
         return new Response("Hello World");
    }

    public record Response (String message){}
}
