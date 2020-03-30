package DependencyInversion;

public class Client {
	public static void main(String[] args) {
		

CustomerDataAccess c=new CustomerDataAccess();
String name=c.GetCustomerName(1);
System.out.println(name);
}
}
