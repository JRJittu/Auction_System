package com.AuctionSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuctionSystemApplication {

	public static void main(String[] args) {
		System.out.println("Auction System Spring Boot App Started!");

		SpringApplication.run(AuctionSystemApplication.class, args);
	}

}
