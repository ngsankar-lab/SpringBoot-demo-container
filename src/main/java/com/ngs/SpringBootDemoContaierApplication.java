package com.ngs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoContaierApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootDemoContaierApplication.class, args);
		Person p1=context.getBean(Person.class);
		p1.show();
		Person p2=context.getBean(Person.class);
		p2.show();
	}

}
