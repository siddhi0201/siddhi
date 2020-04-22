public class MainSingleton {
	
	public static void main(String args[])
	{
		
		// instantiating Singleton class with variable x
		MakeSingleton x = MakeSingleton.get_Instance();
	
		  
        // instantiating Singleton class with variable y 
		MakeSingleton y = MakeSingleton.get_Instance(); 
  
        // instantiating Singleton class with variable z 
		MakeSingleton z = MakeSingleton.get_Instance(); 
  
        // changing variable of instance x 
        x.s = (x.s).toUpperCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
        // changing variable of instance z 
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s);
	}

}
