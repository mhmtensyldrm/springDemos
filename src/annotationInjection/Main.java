package annotationInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("file:src/annotationInjection/applicationContext.xml");
		
		ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
		
		customerDal.Add();
	}

}
