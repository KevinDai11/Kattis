import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class hissingmicrophone {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String s = file.nextLine();
		System.out.println(s.contains("ss") ? "hiss" : "no hiss");
	}

	public static void main(String[] args) throws Exception {
		new hissingmicrophone().run();
	}

}