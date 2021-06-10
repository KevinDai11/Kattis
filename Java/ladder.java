import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ladder {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		System.out.printf("%.0f",Math.ceil(file.nextInt()/(Math.sin(file.nextInt()*Math.PI/180))));
	}

	public static void main(String[] args) throws Exception {
		new ladder().run();
	}

}