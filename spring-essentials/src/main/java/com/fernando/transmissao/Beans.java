package com.fernando.transmissao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class Beans {
    @Bean
	public Gson gson() {
		Gson gson = new Gson();
		return gson;
	}
}
