package abstractPakage;

	public class Machine extends Computer//machine class where we implement abstract method is call concrete class
	{
		
		//all abstract methods we can write in class as non static with body unimplemented methods
		public void monitor()
		{
			System.out.println(" moniter method");

		}
		public void cpu()
		{
			System.out.println("cpu method");

		}
		public void keyboard()
		{
			System.out.println("keyboard method");

		}
		
		@Override
		public void maous()
		{
			System.out.println("maous method");

			
		}
		
	}
