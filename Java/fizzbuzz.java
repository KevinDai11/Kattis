import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class fizzbuzz {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int x=file.nextInt();
		int y=file.nextInt();
		int n = file.nextInt();
		
		for(int u=1;u<=n;u++) {
			if(u%x==0 && u%y==0) {
				System.out.println("FizzBuzz");
			}
			else if(u%x==0) {
				System.out.println("Fizz");
			}
			else if(u%y==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(u);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new fizzbuzz().run();
	}

}