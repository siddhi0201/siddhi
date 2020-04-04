
public class EmployeeBuilder {

	private String fName;
	private String lName;
	private Integer Id;
	
	
	
//	public EmployeeBuilder() {
//		super();
//	}

	public EmployeeBuilder setfName(String fName)
	{
		this.fName = fName;
		return this;
	}
	
	public EmployeeBuilder setlName(String lName)
	{
		this.lName = lName;
		return this;
	}
	
	public EmployeeBuilder setId(Integer Id)
	{
		this.Id = Id;
		return this;
	}

	public Employee getEmployee()
	{
		return new Employee(fName,lName,Id);
	}
}
