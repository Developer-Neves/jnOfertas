package com.jdnevesti.jdofertas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdnevesti.jdofertas.domain.SocialMetaTag;
import com.jdnevesti.jdofertas.service.SocialMetaTagService;

@SpringBootApplication
public class JdofertasApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JdofertasApplication.class, args);
	}
	
	@Autowired
	SocialMetaTagService service;
	
	// Método para testar
	@Override
	public void run (String... args) throws Exception {
		/* Testando as tags no console
		SocialMetaTag tag = service.getSocialMetaTagByUrl("https://www.udemy.com/course/curso-flutter/");		
		System.out.println(tag.toString());	*/		
	}
	
}
