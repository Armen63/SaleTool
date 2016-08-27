package _Homework;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AdressBook {
	public static void main(String [] args){
		
		begin();
	}
	static void begin(){
		Scanner member_input = new Scanner(System.in);
		System.out.println(">> Please write down one of this commands 'Sign In' or 'Sign Up'");
		String input;
		input = member_input.nextLine();
		
		if(input.equals("<<Sign Out"))
			begin();
		else 
		if(input.equals("<<Sign Up"))
			signUp();
		else 
		if(input.equals("<<Sign In"))
			signIn();
		else {
			System.out.println(">>Invalid command. Please write 'Help' command for see command list");
			input = member_input.nextLine();
			if(input.equals("<<Sign Out"))
				begin();
			if(input.equals("Help")){
				//
			}
		}
	}
	
	static void signUp(){
		File file = new File("date2.txt");
		try {
			file.createNewFile();
			PrintWriter out = new PrintWriter(new FileWriter(file));
		Scanner member_input = new Scanner(System.in);
		System.out.println(">>Please provide your username");
		String input_username;
		input_username = member_input.nextLine();
		out.println(input_username +"\n");

		
		System.out.println(">>Please provide your password");
		String input_password;
		input_password= member_input.nextLine();
		out.println(input_password);
		out.flush();
		out.close();
		
		System.out.println(">> You have successfully created user. Please write down one of this commands 'Sign In' or 'Sign Up'");
		String input;
		input = member_input.nextLine();
		if(input.equals("<<Sign Out"))
			begin();
		else
		if(input.equals("<<Sign Up"))
			signUp();
		else
		if(input.equals("<<Sign In"))
			signIn();
		else{
			System.out.println(">>Invalid command. Please write 'Help' command for see command list");
			input = member_input.nextLine();
			if(input.equals("<<Sign Out"))
				begin();
			if(input.equals("Help")){
				// fili dvijeni
			}
		}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	static void signIn(){
		Scanner member_input = new Scanner(System.in);
		File file = new File("date1.txt");
		 try {
				file.createNewFile();
				PrintWriter out = new PrintWriter(new FileWriter(file));
				
		System.out.println(">>Please provide your username"); //                              IN  username
		String input_username;
		input_username= member_input.nextLine(); 
		out.println(input_username +"\n");
		
		System.out.println(">>please provie your password");//								  IN Pass
		String input_password;
		input_password= member_input.nextLine();
		out.write(input_password +"\n");
		out.flush();
		out.close();
		
		Scanner d1, d2;
		d1 = null;
		d2 = null;
		try{
			d1 = new Scanner(new File("date1.txt"));
			d2 = new Scanner(new File("date2.txt"));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		while(d1.hasNextLine()){
			LinkedList<String> up = new LinkedList<>();
			LinkedList<String> in = new LinkedList<>();
			up.add(d1.next());
			in.add(d2.next());
						
		}
		int q;
		while(true){
			q = 1;
			if(in[0].equals(up[0])) // vonc hamematem filic read linox stringer@
				break;
			else {
				if(q == 3)
				{
					System.out.println(">>Your username or password is incorrect please try again");
					return ;
				}
				++q;
				signIn();
			}
		}
		
		
		
		 } catch (IOException e) {
				e.printStackTrace();
			}
		// date1  date2 ic kardal hamematel
		System.out.println(">>You are successfully logged in");
		String s1 = "Add Tel. Numb";
		String s2 = "Show Tel. Numbers";
		System.out.println(">>Now you can write down one of this commands 'Add Tel. Numb' or 'Show Tel. Numbers'");
		atNumber();
	//	else if(tnumber.equals(s1)) // eti hesa kjogenq
		//filic dus berel heraxosi hamarner@
		
		
		
	}
	static void atNumber(){
	
		File file = new File("numbers.txt");
		 try {
			file.createNewFile();
		Scanner member_input = new Scanner(System.in);
		String tnumber;
		tnumber = member_input.nextLine();
		if(tnumber.equals("<<Sign Out"))
			begin();
		else
		if(tnumber.equals("Add Tel. Numb")){
			System.out.println(" Please provide your telephone number");
			tnumber = member_input.nextLine();
			PrintWriter out = new PrintWriter(new FileWriter(file, true));
			out.write(tnumber +"\n"); 
		    out.flush();
		    out.close();
			System.out.println("You have successfully added your number. If you want to add one more please write 'Add Tel. Numb'."
								+ " If you want to see your numbers list please write 'Show Tel. Numbers'");
			tnumber = member_input.nextLine();
			if(tnumber.equals("Add Tel. Numb")){
				atNumber();
			}
			else 
			if(tnumber.equals("Show Tel. Numbers")){
				shtNumber();
			}
			else{
				System.out.println(" >>Your username or password is incorrect please try again");
			}
		}
		 } catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	static void shtNumber(){
		Scanner s = null;
		try{
			s = new Scanner(new File("Hello1.txt"));
		}
		catch(Exception e){
			System.out.println("Error");
		}
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
	}
}
