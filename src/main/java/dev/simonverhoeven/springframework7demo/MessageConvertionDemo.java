package dev.simonverhoeven.springframework7demo;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverters;
import org.springframework.http.converter.json.JacksonJsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.SimpleDateFormat;

@Configuration
public class MessageConvertionDemo implements WebMvcConfigurer {

    @Configuration
    public class WebConfiguration implements WebMvcConfigurer {

        @Override
        public void configureMessageConverters(HttpMessageConverters.ServerBuilder builder) {
            final var mapper = JsonMapper.builder()
                    .findAndAddModules()
                    .enable(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)
                    .defaultDateFormat(new SimpleDateFormat("dd-MM-yyyy"))
                    .build();
            builder.jsonMessageConverter(new JacksonJsonHttpMessageConverter(mapper));
        }
    }
}
