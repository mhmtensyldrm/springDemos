package annotationInjection;

import org.springframework.stereotype.Component;

@Component("database")
public class OracleCustomerDal implements ICustomerDal{
	
	public void add() {
		System.out.println("Oracle veritabanına eklendi.");
	}
	
}
