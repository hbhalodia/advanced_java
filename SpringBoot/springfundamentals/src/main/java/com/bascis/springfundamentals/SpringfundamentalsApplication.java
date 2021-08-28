package com.bascis.springfundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringfundamentalsApplication {

	/**
	 * Depedency Injection :
	 * @param args
	 */
	public static void main( String[] args ) {
		ConfigurableApplicationContext context =  SpringApplication.run( SpringfundamentalsApplication.class, args );

		Student std = context.getBean( Student.class );

		std.message();

		std.getYourSubject();
	}

}
