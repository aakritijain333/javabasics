package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//dis-advantages of array:
		//1. size is fixed: static array: To overcome form this problem, we use collections - dynamic array - ArrayList
		//2. it stores only similar data types: To overcome from this problem, we use Object array.
		
		
		//1 int array:
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		//i[3]=40;//ArrayIndexOutOfBoundsException:
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);
        //size of array
		System.out.println(i.length);
		
		//to print all the values of array:use for loop
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		//double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=100;
//		d[3]=45.55;
		System.out.println(d[2]);
		
		//char array
		char c[]=new char[3];
		c[0]='q';
		c[1]=2;
		c[2]='$';
		
		//boolean array
		boolean b[]=new boolean[2];
		
		b[0]=true;
		b[1]=false;
		
		//string array
		String s[]=new String[3];
		s[0]="test";
		s[1]="Hello";
		s[2]="World";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
        ob[5]="London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		
	
	
	}

}

