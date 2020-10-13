package com.jdnevesti.jdofertas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdnevesti.jdofertas.service.SocialMetaTagService;

@SpringBootApplication
public class JdofertasApplication implements CommandLineRunner{

	public static void main(String[] args) {
		//TimeZone.setDefault(TimeZone.getTimeZone("GMT-3")); //setando a hora local
		//System.out.println(LocalDateTime.now()); // mostrando no log
		SpringApplication.run(JdofertasApplication.class, args); // executando a aplicação		
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
