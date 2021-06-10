import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class babelfish {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		HashMap<String,String> m = new HashMap<>();
		boolean t = true;
		while(file.hasNextLine()) {
			String s[] = file.nextLine().split(" ");
			if(s.length>1) {
				m.put(s[1], s[0]);
			}
			else {
				if(t) {
					t=false;
				}
				else {
					
				System.out.println(m.get(s[0])==null ? "eh" : m.get(s[0]));
				}
				
			}
			
		}
	}

	public static void main(String[] args) throws Exception {
		new babelfish().run();
	}

}