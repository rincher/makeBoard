package com.sparta.makeboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MakeboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MakeboardApplication.class, args);
    }

}
