package com.beini.beinizipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class BeiniZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeiniZipkinApplication.class, args);
	}
}
