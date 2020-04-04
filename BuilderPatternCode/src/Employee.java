
public class Employee {
	
	private String fName;
	private String lName;
	private Integer Id;
	
	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public Integer getId() {
		return Id;
	}

	public Employee(String fName, String lName,Integer Id)
	{
		this.fName = fName;
		this.lName = lName;
		this.Id = Id;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", Id=" + Id + "]";
	}
	

}
