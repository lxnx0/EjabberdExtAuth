package my.domain.xmpp.auth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ae.teletronics")
@SpringBootApplication
public class EjabberdExtAuthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EjabberdExtAuthApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
				
		EjabberdExtAuth ejabberdExtAuth = new EjabberdExtAuth();
		ejabberdExtAuth.setup();
		ejabberdExtAuth.readInput();
		
	}
}
