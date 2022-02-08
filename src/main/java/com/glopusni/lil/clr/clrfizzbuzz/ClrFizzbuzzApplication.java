package com.glopusni.lil.clr.clrfizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClrFizzbuzzApplication {
	private static final Logger LOG = LoggerFactory.getLogger(ClrFizzbuzzApplication.class);

	@Bean
	public CommandLineRunner run(){

		return args -> {
			boolean divisibleBy3;
			boolean divisibleBy5;
			for (int i = 1; i <= 100; i++){
				divisibleBy3 = i % 3 == 0;
				divisibleBy5 = i % 5 == 0;
				String text = "";
				text += divisibleBy3 ? "Fizz" : "";
				text += divisibleBy5 ? "Buzz" : "";

				LOG.info(!text.isEmpty() ? text : String.valueOf(i));
			}

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClrFizzbuzzApplication.class, args);
	}

}
