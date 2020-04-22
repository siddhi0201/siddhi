package stringMethods;

public class LearnToString {

		String name;
		String type;

		public LearnToString(String name,String type)
		{
			this.name = name;
			this.type = type;
		}
		
		@Override
		public String toString() {
			return String.format("LearnToString [name=%s, type=%s]", name, type);
		}

		public static void main(String args[])
		{
			LearnToString lts = new LearnToString("siddhi", "female");
			System.out.println(lts);
		}
	
}
