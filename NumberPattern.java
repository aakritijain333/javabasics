package JavaBasics;

public class NumberPattern { 
	public static void main(String[]args) {
		int rows=9;
		
		for(int i=1;i<=rows;i++) {
//			
					System.out.print(i);
					
					System.out.print("".repeat(rows-i+1));
				
				for (int j=1;j<i;j++) {
			System.out.print("*");
	}
				System.out.println();
	}
}
}