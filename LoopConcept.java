package JavaBasics;

public class LoopConcept {

	public static void main(String[] args) {
		int i=1;
		while(i<=10){
		System.out.println(i);
		i=i+1;
		}
		
		System.out.println("******");
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		
		System.out.println("*****");
		//10 to 1
		//10 9 8 7 6 5 4 3 2 1
		for(int k=10;k>=-10;k--) {
			System.out.println(k);
		}
	}

}
