package practiceSet;

import javax.annotation.Resource;

public class Test {
	
	@Resource
	Singleton test1;
	
	@Resource
	Singleton test2;
	
	@Resource
	Test test3;
	
	@Test
	public void printValues()
	{
		for(int i=0;i<2;i++)
		{
			test1.printValue();
		}
		
		test2.printValue();
		System.out.println(test3.hashCode());
	}
}

	