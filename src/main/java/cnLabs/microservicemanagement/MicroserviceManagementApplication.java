package cnLabs.microservicemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceManagementApplication.class, args);
	}

}
