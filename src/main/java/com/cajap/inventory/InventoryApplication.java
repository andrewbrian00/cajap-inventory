package com.cajap.inventory;

import org.slf4j.event.Level;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
//import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args)  throws IOException {
		SpringApplication.run(InventoryApplication.class, args);
		Logger logger = Logger.getLogger("test test test");
//		logger(Level.INFO,"test");
	}


}
