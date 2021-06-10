import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class aproblem {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int c = 1;

		while(file.hasNextLine()) {
			System.out.println(file.nextLine().toLowerCase().contains("problem") ? "yes" : "no");
		}
	}

	public static void main(String[] args) throws Exception {
		new aproblem().run();
	}

}