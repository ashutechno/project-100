package practgit;

public class child2  extends parent
{
	//step2: money(), farm() and car() methods are inherited
	
		//step3: create property of childclass
		
		public void jobno11()
		{
			System.out.println("Private Job");
		}
		
		//step4: override the properties that are used and changed by child class
		public void money()
		{
			System.out.println(" Money= 3L");
		}
		public void farm()
		{
			System.out.println("Farm = 8 acres");
		}
		public static void main(String[] args) 
		{
			child2 c= new child2();
			c.money();
			c.car();
			c.farm();
			c.job();
			
			System.out.println();
			

			//Step 5: perform upcasting
			// superclassname objectname= new subclassconstructor();
			
			parent obj= new child2();
		//  creating child class object by providing parentclass as reference.

			obj.car();
			obj.money();
			obj.farm();
			System.out.println();
			
			// Step6: Perform downcasting
			// subclassname objectname= (subclassname)upcastingobject;
			
			child2 obj1= (child2)obj;
			
			obj1.car();
			obj1.money();
			obj1.farm();
			obj1.job();		
		}

}
