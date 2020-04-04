package interfac.learn;

import java.util.AbstractList;
import java.util.List;

public interface ITest{

	
	public int number();
	
	List<Integer> lis= new AbstractList<Integer>() {

		@Override
		public Integer get(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
}
