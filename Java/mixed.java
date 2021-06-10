import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class mixed {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(true) {
			int a = file.nextInt();
			int b = file.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a/b +" " + a%b+" / " + b);
		}
	}

	public static void main(String[] args) throws Exception {
		new mixed().run();
	}

}
