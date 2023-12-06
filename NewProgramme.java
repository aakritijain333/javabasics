package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class NewProgramme {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Rahul");
		System.out.println("Enter String :");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
	}

}
