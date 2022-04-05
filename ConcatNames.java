package cancatName;

import java.util.Scanner;

public class ConcatNames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your FirstName");
		String FirstName=sc.next();
		System.out.println("enter your LastName");
		String LastName=sc.next();
		System.out.println("Hello"+" "+FirstName+" "+LastName);

	}

}
