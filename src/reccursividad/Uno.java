package reccursividad;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String text = entrada.next();
		String regex ="[(-)]";
		
	}
	public static boolean validate(String regex,String text) {
		
		return Pattern.matches(regex, text);
	}

}
