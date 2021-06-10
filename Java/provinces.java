import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class provinces {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int g = file.nextInt();
		int s = file.nextInt();
		int c = file.nextInt();
		int total = g*3 + s*2 + c;
		if(total>=8) {
			System.out.print("Province or ");
		}else if(total>=5){
			System.out.print("Duchy or ");
		}else if(total>=2) {
			System.out.print("Estate or ");
		}
		if(total>=6) {
			System.out.println("Gold");
		}
		else if(total>=3) {
			System.out.println("Silver");
		}
		else {
			System.out.println("Copper");
		}
	}

	public static void main(String[] args) throws Exception {
		new provinces().run();
	}

}