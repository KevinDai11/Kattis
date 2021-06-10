import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class lastproblem {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNextLine()) {
			System.out.printf("Thank you, %s, and farewell!",file.nextLine());
		}
	}

	public static void main(String[] args) throws Exception {
		new lastproblem().run();
	}

}