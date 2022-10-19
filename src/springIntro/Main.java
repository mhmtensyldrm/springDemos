package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("file:src/springIntro/applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		customerService.add();
	}
	
}
