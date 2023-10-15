package pro.sprenger.jwswebsiteadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class JwswebsiteadminApplication {

	// https://www.baeldung.com/spring-boot-admin
	public static void main(String[] args) {
		SpringApplication.run(JwswebsiteadminApplication.class, args);
	}

}
