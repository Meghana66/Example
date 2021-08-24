package com.examples.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LoansApplication {
   public static void main(String[] args) {
      SpringApplication.run(LoansApplication.class, args);
   }
   @Bean
   public RestTemplate getRestTemplate() {
      return new RestTemplate();
   }
}
