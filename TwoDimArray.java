package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		
		String X[][]=new String[3][5];
		System.out.println(X.length);
		System.out.println(X[0].length);
		
		X[0][0]="A";
		X[0][1]="B";
		X[0][2]="C";
		X[0][3]="D";
		X[0][4]="E";
		
		
		X[1][0]="A1";
		X[1][1]="B1";
		X[1][2]="C1";
		X[1][3]="D1";
		X[1][4]="E1";
		
		
		X[2][0]="A2";
		X[2][1]="B2";
		X[2][2]="C2";
		X[2][3]="D2";
		X[2][4]="E2";
		
		System.out.println(X[1][2]);
		
		System.out.println(X[2][2]);
		System.out.println(X[0][4]);
		
		
		for(int row=0;row<X.length;row++) {
		for(int col=0;col<X[0].length;col++) {
		System.out.println(X[row][col]);
		}
		}
	}

}
