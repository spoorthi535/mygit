package DependencyInversion;

public class CustomerBusinessLogic
{
	ICustomerDataAccess _custDataAccess;

public CustomerBusinessLogic()
{
    _custDataAccess = DataAccessFactory.GetCustomerDataAccessObj();
}

public String GetCustomerName(int id)
{
    return _custDataAccess.GetCustomerName(id);
}
}

