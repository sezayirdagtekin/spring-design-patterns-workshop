package com.sezayir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sezayir.demo.singleton.Foo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		Foo f1 = Foo.getInstace();
		Foo f2 = Foo.getInstace();
		System.out.println(f1.hashCode() == f2.hashCode());

	}

}
