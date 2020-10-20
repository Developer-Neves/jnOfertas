package com.jdnevesti.jdofertas;

import org.directwebremoting.spring.DwrSpringServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.jdnevesti.jdofertas.service.SocialMetaTagService;

@ImportResource(locations = "classpath:dwr-spring.xml")
@SpringBootApplication
public class JdofertasApplication implements CommandLineRunner{

	public static void main(String[] args) {
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
	
	@Bean
	public ServletRegistrationBean<DwrSpringServlet> dwrSpringServlt(){
		DwrSpringServlet dwrServlet = new DwrSpringServlet();
		
		ServletRegistrationBean<DwrSpringServlet> registrationBean = new ServletRegistrationBean<>(dwrServlet, "/dwr/*");
		
		registrationBean.addInitParameter("debug", "true");
		registrationBean.addInitParameter("activeReverseAjaxEnabled", "true");
		
		return registrationBean;
	}
}
