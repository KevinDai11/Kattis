import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class maptiles {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String s = file.nextLine();
		int l = (int)Math.sqrt(Math.pow(4,s.length()));
		
		int lowerx=0;
		int lowery=0;
		int upperx=l-1;
		int uppery=l-1;
		for(int i=0;i<s.length();i++) {
			char to = s.charAt(i);
			switch(to) {
			case '0':
				upperx-=l/2;
				uppery-=l/2;
				break;
			case '1':
				lowerx+=l/2;
				uppery-=l/2;
				break;
			case '2':
				lowery+=l/2;
				upperx-=l/2;
				break;
			case '3':
				lowerx+=l/2;
				lowery+=l/2;
				break;
			default:
				break;
			}
			l/=2;
		}
		System.out.println(s.length()+" "+ lowerx +" "+ lowery);
	}

	public static void main(String[] args) throws Exception {
		new maptiles().run();
	}

}