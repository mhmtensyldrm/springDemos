package annotationInjection;

public class MySqlCustomerDal implements ICustomerDal{
	
	public void Add() {
		System.out.println("MySql veritabanına eklendi.");
	}

}
