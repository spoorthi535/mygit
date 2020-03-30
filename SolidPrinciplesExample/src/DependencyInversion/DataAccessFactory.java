package DependencyInversion;

public class DataAccessFactory {
	public static ICustomerDataAccess GetCustomerDataAccessObj() 
{
    return new CustomerDataAccess();
}
}