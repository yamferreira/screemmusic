package com.yam.screemmusic;

import com.yam.screemmusic.controller.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreemmusicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreemmusicApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.showMenu();
	}
}
