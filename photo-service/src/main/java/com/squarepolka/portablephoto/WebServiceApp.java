package com.squarepolka.portablephoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebServiceApp
{
	public static void main(String[] args) throws Exception
	{
		SpringApplication.run(WebServiceApp.class, args);
	}
}
