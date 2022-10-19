package annotationInjection;

public class MsSqlCustomerDal implements ICustomerDal{

	
	public void add() {
		System.out.println("MsSql veritabanına eklendi.");
		
	}

}
