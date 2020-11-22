package com.sezayir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.sezayir.demo.proto.ProtoFalse;
import com.sezayir.demo.proto.ProtoTrue;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	public ProtoFalse createPFalse() {
		return new ProtoFalse();
	}

	@Bean
	@Scope("prototype")
	public ProtoTrue createProtoTrue() {
		return new ProtoTrue();
	}

}
