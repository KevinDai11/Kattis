import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class romans {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		System.out.printf("%.0f",(file.nextDouble()*1000*(5280.0/4854.0)));
	}

	public static void main(String[] args) throws Exception {
		new romans().run();
	}

}