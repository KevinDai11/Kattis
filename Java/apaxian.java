import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class apaxian {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String y = file.next();
		String p = file.next();
		if(y.endsWith("ex")) {
			System.out.println(y+p);
		}
		else if(y.endsWith("e")) {
			System.out.println(y+"x"+p);
		}
		else if(y.endsWith("a") || y.endsWith("i")||y.endsWith("o")||y.endsWith("u")){
			System.out.println(y.substring(0,y.length()-1)+"ex"+p);
		}
		else {
			System.out.println(y+"ex"+p);
		}
	}

	public static void main(String[] args) throws Exception {
		new apaxian().run();
	}

}