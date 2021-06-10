import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class R2 {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("R2.dat"));
		while(file.hasNextLine()) {
			System.out.println((file.nextInt()/file.nextInt())/2);
			file.nextLine();
		}
	}

	public static void main(String[] args) throws Exception {
		new R2().run();
	}

}