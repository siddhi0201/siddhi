package learn.implement.stack;

import java.util.HashMap;

public class pattm {
	

public int id;
public String name;
	
	
	public static void main(String args[])
	{
		
		
		
	HashMap<pattm, String> map = new HashMap<>();
	pattm pt1 = new pattm();
	pt1.id = 1;
	pt1.name ="siddhi";
	pattm pt2 = new pattm();
	pt2.id = 1;
	pt2.name = "siddhi";
	pattm pt3 = new pattm();
	pt3.id = 2;
	pt3.name = "xyz";
	
	map.put(pt1, null);
	map.put(pt2, null);
	map.put(pt3, null);
	
	System.out.println(map);
	
	
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pattm other = (pattm) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
