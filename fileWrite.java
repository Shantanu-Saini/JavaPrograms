import java.util.*;
import java.io.*;

class fileWrite {
	public static void main(String args[]) throws IOException{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scn.nextLine();
		
		str = str.toUpperCase();
		System.out.println(str);
		
		FileWriter fwrt = new FileWriter("test.txt");
		
		for(int i = 0; i<str.length();i++){
			fwrt.write(str.charAt(i));
		}
		System.out.println("Writing Succesfull!");
		fwrt.close();
	}
}