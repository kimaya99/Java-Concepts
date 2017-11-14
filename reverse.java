// Reverse a string
import java.io.*;

public class reverse{
	public static void main (String args[]){
       System.out.print(reverse("abc"));
	}

public static String reverse(String str){
	if (str.length() <= 1)
	{
	   return str;
	}
return reverse(str.substring(1)) + str.charAt(0);
}
}