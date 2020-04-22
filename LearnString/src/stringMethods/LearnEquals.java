package stringMethods;

public class LearnEquals {
	
	private int id;

	public LearnEquals(int id)
	{
		this.id = id;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LearnEquals other = (LearnEquals) obj;
		if (id != other.id)
			return false;
		return true;
	}

	static public void main(String args[])
	{
		LearnEquals le = new LearnEquals(25);
		LearnEquals le2 = new LearnEquals(25);
		LearnEquals le3 = le;
		
		
		System.out.println(le.equals(le2));
		System.out.println(le.equals(le3));
	}
	
}
