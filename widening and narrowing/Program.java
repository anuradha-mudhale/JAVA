
public class Program {
	
	/* 
	public static void main(String[] args) {
		byte b = 10; 
		//short s = (short)b;  // Widening
		short s = b;   // Widening
		System.out.println("b  : " + b + " a " + s);
	}*/ 
	
	public static void main(String[] args) {
		short s = 10; 
		byte b = (byte) s; // narrowing  
		System.out.println(b);
	}

}
