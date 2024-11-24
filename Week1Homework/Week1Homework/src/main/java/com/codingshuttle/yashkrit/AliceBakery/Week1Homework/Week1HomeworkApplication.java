package com.codingshuttle.yashkrit.AliceBakery.Week1Homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1HomeworkApplication implements CommandLineRunner {

	@Autowired
	BakeCake bake;

	public static void main(String[] args) {
		SpringApplication.run(Week1HomeworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bake.Baking();
	}
}