
public class Loops {

	public static void main(String[] args) {
		int x = 0;
		while (x <= 100) {
			System.out.println(x);	
			x+=2;
		}
		
		int i = 100;
		while (i >=0) {
			System.out.println(i);
			i-=3;
		}
		
		for (int x = 1; x <= 100; x+=2) {
				System.out.println(x);
			
		}
		
		for (int i = 0; i <= 100; i++) {
			
		if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("HelloWorld");
				i++;		 
			}
			if (i % 3 == 0) {
				System.out.println("Hello");
				i++;
			}
			if (i % 5 == 0) {
				System.out.println("World");
				i++;
			
			} else
	
			System.out.println(i);
		}
		
	}
}

