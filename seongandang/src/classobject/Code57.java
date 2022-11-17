package classobject;

class Block {
	Block() {
		System.out.println("I am constructor");
	}
	
	static {
		System.out.println("I am static block");
	}
	
	{
		System.out.println("I am block");
	}
}

public class Code57 {
	public static void main(String[] args) {
		Block b1 = new Block();
		Block b2 = new Block();
		
		/* I am static block
		 * I am block
		 * I am constructor
		 * I am block
		 * I am constructor */
	}
}
