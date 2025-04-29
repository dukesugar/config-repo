package gcu.msa.config.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class ServiceaApplication implements CommandLineRunner {

	@Autowired
	private Service service;


	public static void main(String[] args) {
		SpringApplication.run(ServiceaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		service.print();
	}

}
