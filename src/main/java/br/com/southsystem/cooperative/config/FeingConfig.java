package br.com.southsystem.cooperative.config;

import br.com.southsystem.cooperative.exception.CpfNotFoundException;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeingConfig {

    @Bean
    public ResponseErrorDecoder clientErrorDecoder() {
        return new ResponseErrorDecoder();
    }

    public class ResponseErrorDecoder implements ErrorDecoder {
        @SneakyThrows
        @Override
        public Exception decode(String key, Response response) {
            return new CpfNotFoundException("The CPF is invalid.");
        }
    }
}
