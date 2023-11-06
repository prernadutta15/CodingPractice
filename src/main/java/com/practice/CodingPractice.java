package com.practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author salman.iraqui
 *
 */

@SpringBootApplication
public class CodingPractice implements CommandLineRunner
{
    public static void main( String[] args )
    {
    	SpringApplication.run(CodingPractice.class, args);
       
    }

	@Override
	public void run(String... args) throws Exception {
		
		 System.out.println("Coding Practice App Started!");	
	}
}
