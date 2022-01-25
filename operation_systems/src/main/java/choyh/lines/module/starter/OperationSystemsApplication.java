package choyh.lines.module.starter;

import choyh.lines.module.modules.BusinessContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class OperationSystemsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(OperationSystemsApplication.class, args);
		new SpringApplicationBuilder()
				.sources(OperationSystemsApplication.class)
				.child(BusinessContext.class)
				.web(WebApplicationType.SERVLET)
				.run(args);
	}

}
