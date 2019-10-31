package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.submit(() -> numbers());
	}

	private static void numbers() {
		for (int i = 0; i < 999 ; i++) {
			System.out.println(Thread.currentThread().getName()+ " " + i);
		}
	}

}
