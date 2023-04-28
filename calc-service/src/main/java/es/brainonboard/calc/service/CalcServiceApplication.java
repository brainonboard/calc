package es.brainonboard.calc.service;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcServiceApplication {
	final static Logger LOGGER=Logger.getLogger(CalcServiceApplication.class.getName());
	public static void main(String[] args) {
		LOGGER.info("CalcServiceApplication Init");
		SpringApplication.run(CalcServiceApplication.class, args);
		LOGGER.info("CalcServiceApplication End.");		
	}

}
