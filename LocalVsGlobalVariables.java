package JavaBasics;

public class LocalVsGlobalVariables {
	String name="Tom";
	int age=25;

	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	public void sum() {
		int i=15;
	    int j=20;
	    int age=25;
	
	}

}
