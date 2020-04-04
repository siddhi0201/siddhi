
public class EmployeeDriver {

	
	public static void main(String args[])
	{
		Employee emp = new EmployeeBuilder().setfName("siddhi").getEmployee();
		System.out.println(emp);
		
	}
}
