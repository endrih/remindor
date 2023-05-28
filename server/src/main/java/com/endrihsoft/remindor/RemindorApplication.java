package com.endrihsoft.remindor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RemindorApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemindorApplication.class, args);
    }

}
