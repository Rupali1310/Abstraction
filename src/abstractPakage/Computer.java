package abstractPakage;

	public abstract class Computer
	{
		Computer()
		{
			System.out.println(" abstract constructor");
		}
		
		public abstract void monitor();//abstract method dont have body
		public abstract void cpu();
		public abstract void maous();
		public abstract void keyboard();
		
		public void printer()
		{
			System.out.println("non abstract method printer");

		}
		public static void sound()
		{
			System.out.println("abstract class have static method as well");

		}

		public static void headphone()
		{
			System.out.println("heaphone is static method in abstract class ");
		}
	
	}
