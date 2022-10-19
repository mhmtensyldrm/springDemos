package classConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("classConfig")
@PropertySource("file:src/classConfig/values.properties")
public class IocConfig {
	@Bean
	public ICustomerDal database() {
		
		return new MsSqlCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		
		return new CustomerManager(database());
	}
	
}
