import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class nodup {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		boolean t = true;
		while(file.hasNext()) {
			String s = file.next();
			if(a.contains(s)) {
				t=false;break;}
			a.add(s);
		}
		System.out.println(t ? "yes" :"no");
	}

	public static void main(String[] args) throws Exception {
		new nodup().run();
	}

}