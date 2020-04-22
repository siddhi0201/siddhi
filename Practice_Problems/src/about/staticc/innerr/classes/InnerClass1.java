package about.staticc.innerr.classes;

public class InnerClass1 {
	
	class InnerClass2
	{
		
	}
	
	static class StaticNestedClass
	{
		private int staticNestedClassVariable;
		public int getStaticNestedClassVariable()
		{
			
			return staticNestedClassVariable; 
		}
		public void setStaticNestedClassVariable(int staticNestedClassVariable) {
			this.staticNestedClassVariable = staticNestedClassVariable;
		}
	}
	
	
		class MethodLocalInnerClass
		{
			public void insideMethodLocalInnerClass()
			{
				System.out.println("we are insideMethodLocalInnerClass");
			}
		}
	

}
