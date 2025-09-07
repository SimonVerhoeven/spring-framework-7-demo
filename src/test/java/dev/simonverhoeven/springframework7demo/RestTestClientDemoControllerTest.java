package dev.simonverhoeven.springframework7demo;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.client.RestTestClient;

class RestTestClientDemoControllerTest {

    @Test
    void greeting(){
        // Given
        final var client = RestTestClient.bindToController(RestTestClientDemoController.class).build();

        // When + Then
        client.get()
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.message").isEqualTo("Hello World");
    }
}