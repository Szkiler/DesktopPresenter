package org.szkiler.dp.server.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.szkiler.dp.core.service.StreamingService;

public class Application {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("app-context.xml");
		StreamingService service = context.getBean(StreamingService.class);
		service.stream();
	}

}
