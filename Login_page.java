package assignments;

import java.util.Scanner;

public class Login_page {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String sp="";
		System.out.println("Enter the Username: ");
		String uname = sc.nextLine();
		
		if((uname.contains(sp)) || uname.length()<4)
		{
			System.out.println("Invalid Username !!");
			return;
		}
		
		System.out.println("Enter the Password: ");
		String password = sc.nextLine();
		
		if((password.contains(sp)) || (password.length()<8))
		{
			System.out.println("Invalid Password !!");
			return;
		}
		
		System.out.println("Registration successfull "+uname);
		
		System.out.println("Enter the Username: ");
		String username = sc.nextLine();
		
		System.out.println("Enter the Username: ");
		String u_password = sc.nextLine();
		
		if(uname.equals(username) && password.equals(u_password))
		{
			System.out.println("Welcome "+username+" you have logged in successfully");
			
		}
		
		else
		{
			System.out.println("Username or Password missmatch !");
		}
		

	}

}
