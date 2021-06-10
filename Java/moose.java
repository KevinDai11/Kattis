import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class moose {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int a = file.nextInt();int b=file.nextInt();
		if(a==0 && b==0) {
			System.out.println("Not a moose");
		}else if(a==b){
			System.out.println("Even " + (a+b));
		}else {
			System.out.println("Odd "+ (Math.max(a, b)*2));
		}
	}

	public static void main(String[] args) throws Exception {
		new moose().run();
	}

}