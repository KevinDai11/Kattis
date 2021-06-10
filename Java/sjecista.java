import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sjecista {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		System.out.println((times-3)*(times-2)*(times-1)*times/24);
	}

	public static void main(String[] args) throws Exception {
		new sjecista().run();
	}

}