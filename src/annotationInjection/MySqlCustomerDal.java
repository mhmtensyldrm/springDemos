package annotationInjection;

public class MySqlCustomerDal implements ICustomerDal{
	
	public void add() {
		System.out.println("MySql veritabanına eklendi.");
	}

}
