import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class planina {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		System.out.printf("%.0f",Math.pow(Math.pow(2, file.nextInt())+1, 2));
	}

	public static void main(String[] args) throws Exception {
		new planina().run();
	}

}